const selectStudent = document.querySelector("#selectStudent");
const studentList = document.querySelector("#studentList");

selectStudent.addEventListener("click", () => {

  fetch("/selectStudent")
  .then(response => response.json())
  .then(result => {

    studentList.innerText = "";

    for(let student of result){
      const tr = document.createElement("tr");
      const arr = ['studentNo', 'studentName', 'studentMajor', 'studentGender'];

      for(let key of arr){
        const td = document.createElement("td");
        td.innerText = student[key];
        tr.append(td);
      }
      studentList.append(tr);

    }

  })

});


