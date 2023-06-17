//提交订单
function  addOrderApi(data){
    return $axios({
        'url': '/order/submit',
        'method': 'post',
        data
      })
}

//提交积分订单
function  addScoreOrderApi(data){
    console.log(data)
    return $axios({
        'url': '/order/submit2',
        'method': 'post',
        data
    })
}

// 减少用户的积分和余额
function  subScoreOrderApi(data){
    return $axios({
        'url': '/order/sub',
        'method': 'get',
        params:{
            money:data
        }
    })
}

//修改用户积分
// function  addScoreOrderApi(data){
//     return $axios({
//         'url': '/order/sub',
//         'method': 'get',
//         data
//     })
// }

//查询所有订单
function orderListApi() {
  return $axios({
    'url': '/order/list',
    'method': 'get',
  })
}

//分页查询订单
function orderPagingApi(data) {
  return $axios({
      'url': '/order/userPage',
      'method': 'get',
      params:{...data}
  })
}

// 查询用户积分
function orderSorceApi(data) {
    return $axios({
        'url': '/score/userScore',
        'method': 'get',
        params:{
            phoneNumber:data
        }
    })
}

//再来一单
function orderAgainApi(data) {
  return $axios({
      'url': '/order/again',
      'method': 'post',
      data
  })
}