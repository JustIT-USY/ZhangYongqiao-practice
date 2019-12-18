using System.Collections;
using System.Collections.Generic;
using UnityEngine;

///<summary>
///MapCamera以上帝视角看人物
///<summary>

public class MapCameraFollow : MonoBehaviour
{
    public Transform playerTrans;
    private Transform trans;
    void Start()
    {
        trans = GetComponent<Transform>();
    }

    private void LateUpdate()
    {
        trans.position = playerTrans.position + new Vector3(0, 30, 0);
    }
}
