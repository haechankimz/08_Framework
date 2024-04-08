const searchTitle = document.querySelector("#searchTitle");
const searchBtn = document.querySelector("#searchBtn");
const updateList = document.querySelector("#updateList");

searchBtn.addEventListener('click', ()=> {

  fetch("/book/search")
  .then(response => response.json())
  .then( result => {

    updateList.innerText="";

    for(let book of result){
      const tr = document.createElement("tr");
      const arr = ['bookNo', 'bookTitle', 'writer', 'price', 'regDate'];

      for(let key of arr){
        const td = document.createElement("td");
        td.innerText = book[key];
        tr.append(td);
      }
      bookList.append(tr);
    }
  });
});