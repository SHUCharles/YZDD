
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<style>
    ul.vertical-nav {
        list-style-type: none;
        margin: 0;
        padding: 0;
        background: #f1f1f1;
        font-size: 0;
        width: 16%;
        height: 100%;
        position: fixed;
        /* bottom: 0;
          top: 0 */
    }

    .vertical-nav li a {
        display: block;
        color: #000;
        padding: 10px;
        font-size: 16px;
        text-align: center
    }

    .vertical-nav li a:hover:not(.active) {
        background: #555;
        color: white;

    }

    .vertical-nav li a.active {
        background: #10d68a;

    }

    a {
        text-decoration: none
    }

    .content {
        margin-left: 16%;
        padding: 5px 10px
    }

    .notshow {
        display: none
    }


    ul.row-nav {
        list-style-type: none;
        margin: 0;
        padding: 0;
        overflow: hidden;
        background-color: #333;
    }

    .row-nav li {
        float: left;
    }

    .row-nav li a,
    .dropbtn {
        display: inline-block;
        color: white;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
    }

    .row-nav li a:hover,
    .dropdown:hover,
    .dropbtn {
        background-color: #111;
    }

    .dropdown {
        display: inline-block;
    }

    .dropdown-content {
        overflow: hidden;
        height: 0;
        transition: 0.5s;
        position: absolute;
        background-color: #f9f9f9;
        min-width: 160px;
        box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
    }

    .dropdown-content a {
        color: black;
        padding: 12px 16px;
        text-decoration: none;
        display: block;
    }

    .dropdown-content a:hover {
        background-color: #f1f1f1
    }

    .dropdown:hover .dropdown-content {
        display: block;
        height: 160px
    }
</style>

<body>
<ul class="vertical-nav">
    <li><a href="http://localhost:8080/user/list" >用户</a></li>
    <li><a href="#news"class="active">数据</a></li>
    <li><a href="http://localhost:8080/login/">退出</a></li>
</ul>

<div class="content">
    <div  data-name='home'>
        <ul class="row-nav">

        </ul>
    </div>
    <div class='show' data-name='news'>
        <div class="container-fluid" id="LG">
            <div class="row-fluid">
                <div class="col-md-10 column">
                    <table class="table table-bordered table-condensed">
                        <thead>
                        <tr>
                            <th>
                                区域ID
                            </th>
                            <th>
                                信标ID
                            </th>
                            <th>
                                区域名称
                            </th>
                            <th>
                                信标横坐标
                            </th>
                            <th>
                                信标纵坐标
                            </th>
                            <th>
                                定位显示
                            </th>
                        </tr>
                        </thead>
                        <tbody>
                        <#list images as image>
                            <tr>
                                <td>
                                    ${image.getImage_id()}
                                </td>
                                <td>
                                    ${image.getData_id()}
                                </td>
                                <td>
                                    ${image.getImage_name()}
                                </td>
                                <td>
                                    ${image.getData_horizontal()}
                                </td>
                                <td>
                                    ${image.getData_ordinate()}
                                </td>
                                <td>
                                    <a href="/data/list?data_id=${image.getData_id()}">详情</a>
                                </td>
                            </tr>
                        </#list>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <div data-name='about' >

    </div>
</div>
</body>
<script>
    let a_list = document.querySelectorAll('.vertical-nav a')
    let div_list = document.querySelectorAll('.content>div')
    div_list.forEach(item => {
        if (item.getAttribute('class') == 'show') {
        return
    }
    item.setAttribute('class', 'notshow')
    })

    console.log(a_list)
    console.log('div_list', div_list)
    a_list.forEach(item_a => {
        item_a.addEventListener('click', function () {
            let href_name = item_a.getAttribute('href').slice(1)
            a_list.forEach((item2) => item2.setAttribute('class', ''))
            item_a.setAttribute('class', 'active')
            div_list.forEach(item_div => {
                let data_name = item_div.getAttribute('data-name')
                if(data_name == href_name) {
                item_div.setAttribute('class', 'show')
            } else {
                item_div.setAttribute('class', 'notshow')
            }
        })
        })
    })
</script>

</html>