function pow(event){

    element = event.currentTarget;
   // element.style.backgroundColor="green";
    element.style.width="75%";
    element.style.height="75%";
    
}
function bow(event){

    element = event.currentTarget;
    element.style.color="red";
    element.style.fontSize = "150%";


}




    //anonymous function
    window.onload = function(){
                                        /*
                                         * useCapture/Event Propagation 
                                         * FALSE : Bubbling target to Root
                                         * TRUE : Capturing, root to target
                                         */
        this.document.getElementById("text1").addEventListener("click", bow, true);
        this.document.getElementById("text2").addEventListener("click", bow, true);
        this.document.getElementById("image").addEventListener("click", pow, true);
    }
