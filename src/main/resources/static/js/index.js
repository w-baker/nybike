$(function(){
    char1();
    char2();
    tables1();
    tables2();
})

//车辆类型统计分析图
function char1() {

    var myChart = echarts.init(document.getElementById("char1"));
    var xtype = []
    var sdata = []

    var uri = "/display/getRideableTypeAndCount"
    $.get(uri,function (result){

        var data = result.data

        for (index in data){
            var count = data[index];
            xtype.push(index)
            sdata.push({value:count,name:index})
        }

        var option = {
            tooltip : {
                trigger: 'item',
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },
            legend: {
                orient : 'vertical',
                x : 'right',
                textStyle : {
                    color : '#ffffff',

                },
                data:xtype
            },

            calculable : false,
            series : [
                {
                    name:'车类型',
                    type:'pie',
                    radius : ['40%', '70%'],
                    itemStyle : {
                        normal : {
                            label : {
                                show : false
                            },
                            labelLine : {
                                show : false
                            }
                        },
                        emphasis : {
                            label : {
                                show : true,
                                position : 'center',
                                textStyle : {
                                    fontSize : '20',
                                    fontWeight : 'bold'
                                }
                            }
                        }
                    },
                    data:sdata
                }
            ]
        };
        myChart.setOption(option);
    });
    window.addEventListener('resize', function () {myChart.resize();})
}

// 用户行为分析
function char2() {

    var myChart = echarts.init(document.getElementById("char2"));
    var xdata = []
    var sdata = []

    var uri = "/display/getUserOpt"
    $.get(uri,function (result){
        var data = result.data

        for (index in data){
            var count = data[index];
            xdata.push(index)
            sdata.push(count)
        }
        var option = {
            tooltip : {
                trigger: 'axis',
                axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                    type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                }
            },
            grid: {show:'true',borderWidth:'0'},

            xAxis: {
                type : 'value',
                axisLabel: {
                    show: true,
                    textStyle: {
                        color: '#fff'
                    }
                },
                splitLine:{
                    lineStyle:{
                        color:['#f2f2f2'],
                        width:0,
                        type:'solid'
                    }
                }

            },

            series: [
                {
                    data: sdata,
                    type: 'bar'
                }
            ],

            calculable :false,
            yAxis : [
                {
                    type : 'category',
                    data :xdata,
                    axisLabel: {
                        show: true,
                        textStyle: {
                            color: '#fff'
                        }
                    },
                    splitLine:{
                        lineStyle:{
                            width:0,
                            type:'solid'
                        }
                    }
                }
            ],
        };
        myChart.setOption(option);
    });
    window.addEventListener('resize', function () {myChart.resize();})
}

// 出发点top5
function tables1() {

    var uri = '/display/getStartStationTop5'
    var nums = []
    var count = 1
    $.get(uri,function (result){
        var data = result.data

        for (key in data) {
            var text = '<tr>\n' +
                '<td>'+count+'</td>' +
                '<td>'+key+'</td>' +
                '<td>'+ data[key]+'</td>' +
                '</tr>'
            nums.push(text)
            count++
        }
        for (i in nums){
            $("#body1").append(nums[i]);
        }
    })
}

//到达点top5
function tables2() {
    var uri = '/display/getEndStationTop5'

    var nums = []
    var count = 1
    $.get(uri,function (result){
        var data = result.data

        for (key in data) {
            var text = '<tr>\n' +
                '<td>'+count+'</td>' +
                '<td>'+key+'</td>' +
                '<td>'+ data[key]+'</td>' +
                '</tr>'
            nums.push(text)
            count++
        }
        for (i in nums){
            $("#body2").append(nums[i]);
        }
    });
}
