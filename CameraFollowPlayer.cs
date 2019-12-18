using System.Collections;
using System.Collections.Generic;
using UnityEngine;

///<summary>
///相机跟随主角  暂时未用！！
///<summary>

public class CameraFollowPlayer : MonoBehaviour
{
    public Transform transPlayer;                   //传入人物值
    private Transform transCamera;
    public float rotateSpeed = 5f;
    Vector3 rotate;
    Vector3 position = new Vector3(0.3f,0,0);
    void Start()
    {
        transCamera = GetComponent<Transform>();
    }

    private void FixedUpdate()
    {
        float mx = Input.GetAxis("Mouse X");
        float my = Input.GetAxis("Mouse Y");
        transCamera.Rotate(my * Time.fixedDeltaTime * rotateSpeed, mx * Time.fixedDeltaTime * rotateSpeed, 0);
        //rotate = transCamera.rotation.eulerAngles;                  //把相机旋转值传给中间值
        transPlayer.eulerAngles = transCamera.rotation.eulerAngles;
        transCamera.position = transPlayer.position + position;
    }

}
