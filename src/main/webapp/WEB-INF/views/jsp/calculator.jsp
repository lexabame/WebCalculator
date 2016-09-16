<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Maven + Spring MVC</title>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">


</head>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Spring 3 MVC Project</a>
        </div>
    </div>
</nav>

<div class="jumbotron">
    <div class="container">
        <h2>Web Calculator</h2>
    </div>
</div>

<div class="container">

    <div class="row">
        <div class="col-md-4">

        </div>
        <div class="col-md-4">
            <form:form method="POST" commandName="operationModel" action="/operation/execute">


                <div class="form-group">
                    <form:input path="data" type="text" class="form-control" id="idTextInput" placeholder="0.0"
                            cssStyle="font-size: 50px;font-weight: bold; height: auto !important;"/>
                </div>
                <form:button type="button" class="btn btn-default btn-lg number"><h1><strong> 7 </strong>
                </h1></form:button>
                <form:button type="button" class="btn btn-default btn-lg number"><h1><strong> 8 </strong>
                </h1></form:button>
                <form:button type="button" class="btn btn-default btn-lg number"><h1><strong> 9 </strong>
                </h1></form:button>
                <form:button type="submit" class="btn btn-default btn-lg operator"><h1><strong>/</strong>
                </h1></form:button>
                <form:button type="submit" class="btn btn-default btn-lg operator"><h1><strong>-</strong>
                </h1></form:button>
                <form:button type="button" class="btn btn-default btn-lg clear"><h1><strong>C</strong>
                </h1></form:button>


                <form:button type="button" class="btn btn-default btn-lg number"><h1><strong>4</strong>
                </h1></form:button>
                <form:button type="button" class="btn btn-default btn-lg number"><h1><strong>5</strong>
                </h1></form:button>
                <form:button type="button" class="btn btn-default btn-lg number"><h1><strong>6</strong>
                </h1></form:button>
                <form:button type="submit" class="btn btn-default btn-lg operator"><h1><strong>*</strong>
                </h1></form:button>
                <form:button type="submit" class="btn btn-default btn-lg operator"><h1><strong>+</strong>
                </h1></form:button>
                <form:button type="button" class="btn btn-default btn-lg"><h1><strong>D</strong></h1></form:button>


                <form:button type="button" class="btn btn-default btn-lg number"><h1><strong>1</strong>
                </h1></form:button>
                <form:button type="button" class="btn btn-default btn-lg number"><h1><strong>2</strong>
                </h1></form:button>
                <form:button type="button" class="btn btn-default btn-lg number"><h1><strong>3</strong>
                </h1></form:button>
                <form:button type="button" class="btn btn-default btn-lg number"><h1><strong>0</strong>
                </h1></form:button>
                <form:button type="submit" class="btn btn-default btn-lg"><h1><strong>=</strong></h1></form:button>
                <form:button type="button" class="btn btn-default btn-lg"><h1><strong>F</strong></h1></form:button>

            </form:form>

        </div>
        <div class="col-md-4">

        </div>
    </div>


    <hr>
    <footer>
        <p>© Alex 2015</p>
    </footer>
</div>


<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<script type="application/javascript">

    $(document).ready(function () {

        $('.number').click(function () {
            var number = $(this).text();
            var input = $("#idTextInput").val();
            var concat = input.trim() + number.trim();
            $("#idTextInput").val(concat);
        });

        $('.operator').click(function () {
            var number = $(this).text();
            var input = $("#idTextInput").val();
            var concat = input.trim() + number.trim();
            $("#idTextInput").val(concat);
        });

        $('.clear').click(function () {
            $("#idTextInput").val("");
        });

    })


</script>

</body>
</html>
