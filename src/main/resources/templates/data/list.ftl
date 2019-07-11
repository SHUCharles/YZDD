<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,height=device-height">
    <title>SHU-YZDD</title>
    <style>
        ::-webkit-scrollbar{display:none;}html,body{overflow:hidden;height:100%;margin:0;}
        #mountNode {
            background: url(${data.getImage_address()});
            background-repeat: no-repeat;
            background-size: 100% 80%;
            background-position: 50px 100px;
        }
    </style>
</head>
<body>
<div id="mountNode"></div>
<script>/*Fixing iframe window.innerHeight 0 issue in Safari*/document.body.clientHeight;</script>
<script src="https://gw.alipayobjects.com/os/antv/pkg/_antv.g2-3.5.1/dist/g2.min.js"></script>
<script src="https://gw.alipayobjects.com/os/antv/pkg/_antv.data-set-0.10.1/dist/data-set.min.js"></script>
<script>
    var info = [{
        x: ${data.getData_horizontal()},
        y: ${data.getData_ordinate()},
        z: 'YDZZ',
        name: 'BE',
        country: '多点定位后台系统'
    }]

    var chart = new G2.Chart({
        container: 'mountNode',
        forceFit: true,
        height: window.innerHeight,
        padding: [20, 20, 50, 80],
        plotBackground: {
            stroke: '#ccc', // 边颜色
            lineWidth: 1 // 边框粗细
        } // 绘图区域背景设置
    });
    chart.source(info, {
        x: {
            alias: 'Horizontal', // 定义别名
            tickInterval: 3, // 自定义刻度间距
            nice: false, // 不对最大最小值优化
            max: 30, // 自定义最大值
            min: 0 // 自定义最小是
        },
        y: {
            alias: 'Ordinate',
            tickInterval: 3,
            nice: false,
            max: 30,
            min: 0
        },
        z: {
            alias: 'Team'
        }
    });
    // 开始配置坐标轴
    chart.axis('x', {
        label: {
            formatter: function formatter(val) {
                return val + ' m'; // 格式化坐标轴显示文本
            }
        },
        grid: {
            lineStyle: {
                stroke: '#d9d9d9',
                lineWidth: 1,
                lineDash: [2, 2]
            }
        }
    });
    chart.axis('y', {
        title: {
            offset: 64
        },
        label: {
            formatter: function formatter(val) {
                if (val > 0) {
                    return val + 'm';
                }
            }
        }
    });
    chart.legend(false);
    chart.tooltip({
        title: 'country'
    });
    chart.point().position('x*y').color('#1890ff').size('z', [10, 40]).label('name*country', {
        offset: 0, // 文本距离图形的距离
        textStyle: {
            fill: '#1890FF'
        }
    }).opacity(0.3).shape('circle').tooltip('x*y*z').style({
        lineWidth: 1,
        stroke: '#1890ff'
    });
    chart.guide().line({
        top: true,
        start: [65, 'min'],
        end: [65, 'max'],
        text: {
            content: 'Safe fat intake 65g/day',
            position: 'end',
            autoRotate: false,
            style: {
                textAlign: 'start'
            }
        }
    });
    chart.guide().line({
        top: true,
        start: ['min', 50],
        end: ['max', 50],
        text: {
            content: 'Safe sugar intake 50g/day',
            position: 'end',
            style: {
                textAlign: 'end'
            }
        }
    });
    chart.render();
</script>
</body>
</html>