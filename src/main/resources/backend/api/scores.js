const getOrderDetailPage = (params) => {
    return $axios({
        url: '/score/page',
        method: 'get',
        params
    })
}


