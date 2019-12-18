using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

///<summary>
///管理显示玩家血量
///<summary>

public class Hp : MonoBehaviour
{
    private Text tex;
    
    void Start()
    {
        tex = GetComponent<Text>();   
    }

    private void Update()
    {
        tex.text = string.Format("HP : {0}", PlayerInfo.HP);
    }
}
