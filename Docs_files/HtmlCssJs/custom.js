function myFunction() {
    var txt;
    var txt2;
    var element = document.getElementById("countries");

    var Country = prompt("Please enter Country name:", "").toUpperCase();
    for (i=0;i<element.length;i++){
    if (Country !== null && Country !== "" && Country == element[i].value ){
                element.value = Country;
                txt = Country + " country selected";
                setTimeout(function(){
                alert(Country + " country selected");
        }, 1000);
        break;
            }
            else if(Country === null || Country === "")
            {
              txt = "country name not entered";
            }
       else  {
            txt = "Wrong country name";
        }
    }

    document.getElementById("demo").innerHTML = txt;
}
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        document.getElementById("GoToUpBtn").style.display = "block";
    } else {
        document.getElementById("GoToUpBtn").style.display = "none";
    }
}

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
    document.body.scrollTop = 0;
    document.documentElement.scrollTop = 0;
}