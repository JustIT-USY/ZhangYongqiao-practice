using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.AI;

///<summary>
///Ai 寻路
///<summary>

public class AiAgent : MonoBehaviour
{
    public static int attackedCount = 0;                //记录玩家被敌人攻击次数；

    public Transform trans;
    private NavMeshAgent navAgent;
    private Animator anim;
    private Transform transAi;
    public float distanceAiWithPlayer = 1f;
    void Start()
    {   //初始化
        transAi = GetComponent<Transform>();
        navAgent = GetComponent<NavMeshAgent>();
        anim = GetComponent<Animator>();
    }

    private void Update()
    {   
        navAgent.destination = trans.position+new Vector3(0.5f,0.5f,0.5f);                      //设置ai目的寻路坐标
        //anim.SetFloat("Speed", navAgent.speed);                                               //将ai移动速度传给动画内的条件控制值
        if(Vector3.Distance(trans.position,transAi.position)<distanceAiWithPlayer)              //当ai距离与目标距离小于该值时 开启攻击动画
        {
            navAgent.speed = 0;                                                                 
            anim.SetFloat("Speed", navAgent.speed);                                             //设置速度为0切换动画
            anim.SetBool("Distance", true);
        }
        if(Vector3.Distance(trans.position, transAi.position) > distanceAiWithPlayer)           //>该距离时，继续奔跑寻路
        {   
            if(anim.GetBool("Distance") == true)
                anim.SetBool("Distance", false);
            navAgent.speed = 2.5f;
            anim.SetFloat("Speed", navAgent.speed);
        }
    }

    private void LateUpdate()
    {
        if(AiInfo.currentHp <= 0)                                                                //血量低于某值时，死亡
        {
            navAgent.speed = 0;
            anim.SetInteger("Hp", AiInfo.currentHp);
            GameObject.Destroy(this.gameObject, 3f);
        }
    }
}
