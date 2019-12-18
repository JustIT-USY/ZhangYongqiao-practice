using System.Collections;
using System.Collections.Generic;
using UnityEngine;

///<summary>
///当敌人数量少于某个值时，自动生成敌人
///<summary>

public class CreateAi : MonoBehaviour
{
    public new GameObject gameObject;
    public int enemyCount = 5;
    public Vector3[] vecPostion;                                //生成敌人的坐标点（最少一个）
    private int rand;                                           //接受随机数 并决定出生点
    private readonly float realTime = 1.5f;                     //设置生成敌人时间间隔
    private float countTime;                                    //记录临时时间
    private int count = 0;
    private void Update()
    {   
        if(GameObject.FindGameObjectsWithTag("Enemy") != null)
        {
            count = GameObject.FindGameObjectsWithTag("Enemy").Length;             //通过标签查找敌人 并返回数组长度
        }
        JudgeEnemyCount(count);
    }

    private void JudgeEnemyCount(int count)
    {
        if (count < enemyCount)                                                     //与预设最少数量做对比
        {
            countTime += Time.deltaTime;
            if(countTime > realTime)
            {
                rand = Random.Range(1, vecPostion.Length);      
                Instantiate(gameObject, vecPostion[rand], Quaternion.identity);         //通过rand值调用对应数组内的Vector值并生成
                countTime = 0;
            }
            
        }
    }
}
