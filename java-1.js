// Function to add a new work experience field
function addNewWEField() {
   let newNode = document.createElement('textarea');
   newNode.classList.add('form-control');
   newNode.classList.add('workExperienceField'); // Updated class name
   newNode.classList.add('mt-2');
   newNode.setAttribute('rows', 3);
   newNode.setAttribute('placeholder', 'Enter here');

   let weOb = document.getElementById('we');
   let weAddButtonOb = document.getElementById('weAddButton');
   weOb.insertBefore(newNode, weAddButtonOb);
}

// Function to add a new academic qualification field
function addNewAQField() {
   let newNode = document.createElement('textarea');
   newNode.classList.add('form-control');
   newNode.classList.add('workExperienceField'); // Corrected class name
   newNode.classList.add('mt-2');
   newNode.setAttribute('rows', 3);
   newNode.setAttribute('placeholder', 'Enter here');

   let aqOb = document.getElementById('aq');
   let aqAddButtonOb = document.getElementById('aqAddButton'); // Corrected case
   aqOb.insertBefore(newNode, aqAddButtonOb);
}

// Function to generate CV
function generateCV() {
   // ... (your existing code)

   // Corrected class names in the 'generateCV' function
   let work = document.getElementsByClassName('workExperienceField');
   let str = "";

   for (let e of work) {
      str = str + <li>${e.value}</li>;
   }

   document.getElementById('workexperiencetag').innerHTML = str;

   // Corrected class name in the 'generateCV' function
   let aqs = document.getElementsByClassName('workExperienceField');
   let str1 = '';

   for (let e of aqs) {
      str1 += <li>${e.value}</li>;
   }

   document.getElementById('aqT').innerHTML = str1;

   // ... (rest of your existing code)
}

function printCV() {
   window.print();
}