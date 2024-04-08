const selectBtn = document.querySelector("#selectBtn");
const bookList = document.querySelector("#bookList");

selectBtn.addEventListener("click", () => {


  fetch("/book/selectBook")
  .then(response => response.json())
  .then(list => {

    bookList.innerHTML="";

    for(let book of list){
      const tr = document.createElement("tr");
      const arr = ['bookNo', 'bookTitle', 'writer', 'price', 'regDate'];

      for(let key of arr){
        const td = document.createElement("td");
        td.innerText = book[key];
        tr.append(td);
      }
      
      bookList.append(tr);
    }

    
  })
});




