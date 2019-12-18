using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
///<summary>
///显示当前弹夹内子弹数和备弹数
///<summary>

public class Bullets : MonoBehaviour
{
    private Text tex;
    void Start()
    {
        tex = GetComponent<Text>();
    }

    private void LateUpdate()
    {   
        if(PlayerInfo.currentBullet<=0)
        {
            tex.text = string.Format("子弹数 : 0/{0}",PlayerInfo.bulletNum);
        }
        else
        tex.text = string.Format("子弹数 : {0}/{1}",PlayerInfo.currentBullet,PlayerInfo.bulletNum);
    }
}
