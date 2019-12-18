using System.Collections;
using System.Collections.Generic;
using UnityEngine;

///<summary>
///射击
///<summary>

public class GamerShoot : MonoBehaviour
{
    public float minTimeSpan = 0.12f;                               //连续发射子弹的最小时间间隔
    private float countTime = 0f;                                   //记录临时时间
    [HideInInspector]
    public float bombChangingTime = 3f;                             //换弹时间

    private RaycastHit rayCast;                                     //记录碰撞信息
    private Ray aRay;
    private Vector3 vecPostion = new Vector3(Screen.width / 2, Screen.height / 2, 0);       //取屏幕中点



    private void Update()
    {
        countTime += Time.deltaTime;
        AiInfo.rand = Random.Range(15, 35);                                             //造成伤害随机值
        if (Input.GetMouseButton(0) && (countTime >= minTimeSpan))                       //限制射速
        {
            aRay = Camera.main.ScreenPointToRay(vecPostion);                            //设置射线方向
            if (PlayerInfo.currentBullet > 0)
            {
                //aRay:投出的射线，raycast：检测到碰撞的物体 MAXValue：射线最大长度 LayerMask：投射的层
                if (Physics.Raycast(aRay, out rayCast, float.MaxValue, LayerMask.GetMask("Enemy"))) //碰到Enemy标签才执行
                {
                    PlayerInfo.currentBullet -= 1;                                             //每次执行则弹夹剩余子弹减1
                    AiInfo.currentHp -= AiInfo.rand;                                            //血量减少
                    print("ddddddddddddddd");
                }
                else
                {
                    PlayerInfo.currentBullet -= 1;
                }
                countTime = 0;
            }
        }
        if (PlayerInfo.currentBullet < 30)
        {
            if ((PlayerInfo.bulletNum + PlayerInfo.currentBullet) < 30)                         //子弹总和不过30时
            {
                if (Input.GetKeyDown(KeyCode.R))
                {
                    PlayerInfo.currentBullet += PlayerInfo.bulletNum;                           //计算备弹与弹夹容量
                    PlayerInfo.bulletNum = 0;
                }
            }
            else
            {
                if (Input.GetKeyDown(KeyCode.R))
                {
                    PlayerInfo.bulletNum -= (30 - PlayerInfo.currentBullet);
                    PlayerInfo.currentBullet = 30;
                }
            }
        }



    }
}
