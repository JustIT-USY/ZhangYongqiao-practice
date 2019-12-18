using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

///<summary>
///计时
///<summary>

public class RecordingTime : MonoBehaviour
{
    private Text tex;

    public int initTime = 300;                       //初始时长（秒）
    private float tempTime = 0;
    private float second = 1;
    void Start()
    {
        tex = GetComponent<Text>();
    }

    private void Update()
    {
        tempTime += Time.deltaTime;
        if(tempTime>= second)
        {   
            if(initTime < 30)
            {
                tex.color = Color.red;
            }
            initTime--;
            tex.text = string.Format("Time {0:d2}:{1:d2}", initTime/60, initTime%60);
            tempTime = 0;
        }
    }
}
