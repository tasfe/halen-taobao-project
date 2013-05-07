<#import "/templates/root.ftl" as root >

<@root.html active=2 css=["jdpicker.css"] js=["highcharts.js", "exporting.js"]>
	<table class="table table-striped table-bordered table-condensed">
	    <thead>
          <tr>
            <th>编号</th>
            <th>颜色</th>
            <th>重量(千克)</th>
            <th>单价(元)</th>
            <th>38</th>
            <th>39</th>
            <th>40</th>
            <th>41</th>
            <th>42</th>
            <th>43</th>
            <th>44</th>
            <th>操作</th>
          </tr>
        </thead>
        <tbody>
        	<#list goodsList as goods>
	          <tr>
	            <td>${goods.hid}</td>
	            <td>${goods.color}</td>
	            <td>${goods.weight/1000}</td>
	            <td>${goods.price/100}</td>
	            <td>${goods.thity_eight}</td>
	            <td>${goods.thity_nine}</td>
	            <td>${goods.forty}</td>
	            <td>${goods.forty_one}</td>
	            <td>${goods.forty_two}</td>
	            <td>${goods.forty_three}</td>
	            <td>${goods.forty_four}</td>
                <td>
                     <a href="#" onClick="modifyBase(${goods.id})">修改商品属性</a> 
                     进货  
                     销货
                </td>
	          </tr>
	        </#list>
        </tbody>
      </table>

      <div class="modal hide" id="modifyBaseModal">
          <div class="modal-header">
            <a class="close" data-dismiss="modal">×</a>
            <h4>修改商品属性</h4>
          </div>
          <div class="modal-body">
            <table class="table table-striped table-bordered table-condensed">
                <thead>
                  <tr>
                    <th>编号</th>
                    <th>颜色</th>
                    <th>重量(千克)</th>
                    <th>单价(元)</th>
                  </tr>
                </thead>
                <tbody>
                      <tr>
                        <td><input id="hid" type="text" class="input-small"></td>
                        <td><input id="color" type="text" class="input-small"></td>
                        <td><input id="weight" type="text" class="input-small"></td>
                        <td><input id="price" type="text" class="input-small"></td>
                        <input id="id" type="hidden"/>
                        <input id="modified" type="hidden"/>
                      </tr>
                </tbody>
            </table>
          </div>
          <div class="modal-footer">
            <a href="#" class="btn" data-dismiss="modal">关闭</a>
            <a href="#" class="btn btn-primary" onClick="saveBase()">保存更新</a>
          </div>
      </div>

      <div class="modal hide" id="error-info">
          <div class="modal-header">
            <a class="close" data-dismiss="modal">×</a>
            <h4>出错啦！</h4>
          </div>
          <div id="error-body" class="modal-body">
            
          </div>
          <div class="modal-footer">
            <a href="#" class="btn" data-dismiss="modal">关闭</a>
          </div>
      </div>

        
</@root.html>

<script type="text/javascript">
    function modifyBase(id) {
        $.ajax({
            type: "get",//使用get方法访问后台
            dataType: "json",//返回json格式的数据
            url: "${rc.contextPath}/huopin/get_goods_by_id",//要访问的后台地址
            data: "id=" + id,//要发送的数据
            success: function(goodsBase){//msg为返回的数据，在这里做数据绑定
                $('#id').val(goodsBase.id);
                $('#hid').val(goodsBase.hid);
                $('#color').val(goodsBase.color);
                $('#weight').val(goodsBase.weight/1000);
                $('#price').val(goodsBase.price/100);
                $('#modified').val(goodsBase.modified);
                $('#modifyBaseModal').modal({
                    keyboard: false
                })
            }});        
    }

    function saveBase() {
        var goodsBase = '{"id": "' + $("#id").val() + '", "hid": "' + $("#hid").val() + '", "color": "' 
                          + $("#color").val() + '", "weight": "' + $("#weight").val()*1000 + '", "price": "' 
                          + $("#price").val()*100 + '", "modified": "' + $("#modified").val() + '"}';
        $.ajax({
            type: "post",
            contentType:"application/json; charset=utf-8",
            dataType: "json",
            processData: false,
            url: "${rc.contextPath}/huopin/update_goods_base",
            data: goodsBase,
            success: function(result){
                $('#modifyBaseModal').modal('hide')
                if(result.success==true) {
                    location.reload();
                } else {
                    $('#error-body').html("<p>" + result.errorInfo + "</p>");
                    $('#error-info').modal({
                        keyboard: false
                    })
                }               
            }}); 
    }

    $(document).ready(function(){
          $('#error-info').on('hidden', function () {
              location.reload();
          })
    })
</script>
