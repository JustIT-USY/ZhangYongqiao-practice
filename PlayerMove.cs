using System.Collections;
using System.Collections.Generic;
using UnityEngine;

///<summary>
///角色移动 跳跃 相机跟随
///<summary>

public class PlayerMove : MonoBehaviour
{
    public Transform transCamera;
    //private CharacterController charCon;
    //private Rigidbody rigid;
    private Transform trans;
    public float moveSpeed = 5f;                //移动
    public float jumpSpeed = 7f;                //跳跃
    public float rotateSpeed = 3f;              //旋转速度
    float mx;                                   //获得鼠标的x，y轴方向的值
    float my;
    float x = 0;                                //获得计算过后的旋转角度
    float y = 0;
    float rotateMin = -60f;                     //相机y轴上的最大仰角和俯角
    float rotateMax = 60f;
    Vector3 position = new Vector3(0.3f, 1f, 0);     //相机相对于player的位置
    void Start()
    {
        trans = GetComponent<Transform>();
        //charCon = GetComponent<CharacterController>();
        //rigid = GetComponent<Rigidbody>();
    }

    private void FixedUpdate()
    {   
        float h = Input.GetAxis("Horizontal");
        float v = Input.GetAxis("Vertical");
        float j = Input.GetAxis("Jump");
        trans.Translate(moveSpeed*h*Time.fixedDeltaTime, j*jumpSpeed*Time.fixedDeltaTime,moveSpeed*v*Time.fixedDeltaTime); //移动跳跃
        mx = Input.GetAxis("Mouse X");
        my = Input.GetAxis("Mouse Y");
        x += mx * rotateSpeed;
        y += my * rotateSpeed;
        trans.eulerAngles = new Vector3(0, x, 0);               //人物无法向上看（旋转）（没有动画）相机可以
    }

    private void LateUpdate()
    {
        y = Mathf.Clamp(y, rotateMin, rotateMax);                       //限制相机的俯角和仰角度数
        transCamera.position = trans.position + position;               //固定相机与角色的相对位置
        transCamera.eulerAngles = new Vector3(-y,x,0);                  //相机旋转
    }
}
