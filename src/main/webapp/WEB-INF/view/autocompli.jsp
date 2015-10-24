<!DOCTYPE>
<html>
<head>
  <title>Auto Complete in JSP Java</title>
  <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
  <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  <script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
  <script>
    $(function() {
      $("#names").autocomplete({
        source: function(request, response) {
          $.ajax({
            url: "/TennisTurnament/autocompli",
            type: "POST",
            dataType: "json",
            data: { name: request.term},
            success: function( data ) {

              response( $.map( data, function( item ) {
                return {
                  label: item.name,
                  value: item.value,
                }
              }));
            },
            error: function (error) {
              alert('error: ' + error);
            }
          });
        },
        minLength: 2
      });
    });
  </script>
</head>

<body>
<input type="text" name="name" id="names" />
</body>
</html>