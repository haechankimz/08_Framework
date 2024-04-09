const searchTitle = document.querySelector("#searchTitle");
const searchBtn = document.querySelector("#searchBtn");
const updateList = document.querySelector("#updateList");

searchBtn.addEventListener('click', ()=> {

  fetch("/book/search")
  .then(response => response.json())
  .then(list => {
    
    console.log(list);
    
    

  })
  
 
 
 
 
 
})

