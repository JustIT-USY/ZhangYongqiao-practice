using System.Collections;
using System.Collections.Generic;
using UnityEngine;

///<summary>
///玩家基本信息
///<summary>

public class PlayerInfo : MonoBehaviour
{
    public static int HP = 100;                         //人物初始血量
    public static int bulletNum = 90;                   //备弹数量
    public static int initBullet = 30;                  //初始弹夹容量（最大容量）
    public static int currentBullet = initBullet;       //当前容量
}
