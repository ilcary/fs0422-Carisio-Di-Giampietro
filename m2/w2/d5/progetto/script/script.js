
/* function reveal() {
    let reveals = document.querySelectorAll(".reveal");
  
    for (let i = 0; i < reveals.length; i++) {
      let windowHeight = window.innerHeight;
      //window.innerHeight mi da l'altezza del  viewport.
  
      let elementTop = reveals[i].getBoundingClientRect().top;
      //getBoundingClientRect().top mi da la distanza dal top della viewport
  
      let elementVisible = 150;
  
      if (elementTop < windowHeight - elementVisible) {
        reveals[i].classList.add("active");
      } else {
        reveals[i].classList.remove("active");
      }
    }
  } */