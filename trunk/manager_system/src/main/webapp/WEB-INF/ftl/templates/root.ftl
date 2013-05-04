<#macro html title css=[] js=[] custom_css="" custom_js="">
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${title}</title>
    <link href="${rc.contextPath}/css/bootstrap.css" rel="stylesheet">
    <link href="${rc.contextPath}/css/bootstrap-responsive.css" rel="stylesheet">
    <link href="${rc.contextPath}/css/ea.css" rel="stylesheet">
    <link href="${rc.contextPath}/css/jdpicker.css" rel="stylesheet">
    <link href="${rc.contextPath}/css/theme.bootstrap.css" rel="stylesheet">
    <#list css as entry>
      <link href="${rc.contextPath}/css/${entry}" rel="stylesheet">
    </#list>
    <style type="text/css">
        ${custom_css!''}
    </style>
      
  </head>
  <body>
    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container-fluid">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="#">社会主义最民主</a>
          <div class="nav-collapse">
            <ul class="nav">
              <li class="active"><a href="#">首页</a></li>
              <li><a href="#about">关于</a></li>
              <li><a href="#contact">联系</a></li>
            </ul>
            <p class="navbar-text pull-right">我代表<a href="#">人名</a></p>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container-fluid">
      <div class="row-fluid">
        <div class="span2">
          <div class="well sidebar-nav" style="padding: 8px 0;">
            <ul class="nav nav-list">
              <li class="nav-header">列表头</li>
              <li class="active"><a href="#"><i class="icon-white icon-home"></i> 首页</a></li>
              <li><a href="#"><i class="icon-book"></i> 类库</a></li>
              <li><a href="#"><i class="icon-pencil"></i> 应用</a></li>
              <li class="nav-header">另一个列表头</li>
              <li><a href="#"><i class="icon-user"></i> 介绍</a></li>
              <li><a href="#"><i class="icon-cog"></i> 设置</a></li>
              <li class="divider"></li>
              <li><a href="#"><i class="icon-flag"></i> 帮助</a></li>
            </ul>
          </div>
        </div>
        <div class="span8">
          fsfsfeadsaqfdafeafesgsgdgdgtdrgrg
          <#nested>
        </div>
      </div>
      </div>
    </div>
    

    <script src="${rc.contextPath}/js/jquery-min.js"></script>
    <script src="${rc.contextPath}/js/bootstrap.js"></script>
    <script src="${rc.contextPath}/js/jquery.flot.js"></script>
    <script src="${rc.contextPath}/js/jquery.jdpicker.js"></script>
    <script src="${rc.contextPath}/js/jquery.tablesorter.min.js"></script>
    <script src="${rc.contextPath}/js/jquery.tablesorter.widgets.js"></script>
    <!-- Additional files for the Highslide popup effect -->
    <script type="text/javascript" src="${rc.contextPath}/js/highslide-full.min.js"></script>
    <script type="text/javascript" src="${rc.contextPath}/js/highslide.config.js" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="${rc.contextPath}/css/highslide.css" />

    <#list js as entry>
    <script src="${rc.contextPath}/js/${entry}"></script>
    </#list>
    <script type="text/javascript">
      ${custom_js!''}
    </script>
  </body>
</html>
</#macro>


