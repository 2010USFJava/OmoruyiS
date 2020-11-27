   /* var (scope): 
    * let (scope):
    * global (scope):
    */

const data = null;

//load player
function loadPlayer(player){
    document.getElementById("i_name").innerHTML =
    player.data[0].first_name 
    + " " + 
    player.data[0].last_name
    + " " +
    player.data[0].team.full_name;
                                               /* player = parsed json object 
                                                * name = id_name of object
                                                */
}

//get player
function getPlayer(){
    console.log("Inside getPlayer function");
    let playerName = document.getElementById("i_playerName").value; //What ever the value is we place into this ID

    // [1] Create new xhr object 
    var xhr = new XMLHttpRequest();
    //xhr.withCredentials = true; // API requirement
    // [2] Define onreadystatechange value
    xhr.onreadystatechange = function(){
        console.log("inside onreadystate");
        if(xhr.readyState == 4 &&  xhr.status==200){
            console.log("Response Text" + xhr.responseText); // just string text
            var player = JSON.parse(xhr.responseText);  // parses the JSON text into an object
            loadPlayer(player); // Call load player function
        }
    }
    // [3] Open a request
    xhr.open("GET", "https://www.balldontlie.io/api/v1/players?search="+playerName, true);
            /* HTTP Method: 'GET' (requesting info)
             * URL: https://www.balldontlie.io/api/v1/players?search=davis (need info from this api)
             * Asynchronous: True
             */
    // [4] Send request
    xhr.send();
}

//setup an event listener
window.onload = function(){
    console.log("onload event listener");
    document.getElementById("i_submutPlayerName").addEventListener("click", getPlayer, false);
    /* [1] click            : event
     * [2] xhr function     : getPlayer
     * [3] The use capture  : bubble or capture
    */
}

