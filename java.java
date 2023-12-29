<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
     integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" 
     crossorigin="anonymous">
    <link rel="stylesheet" href="ruhulla.css" />

    <title>Resume Generator123</title>
</head>
<body>

<div class="container" id="cv-form">
    <h1 class="text-center my-2">Resume Generator</h1>
    <center><p>Online Resume Generator</p></center>
    <div class="row">

       <div class="col-md-6">
        <h3>Personal Information</h3>
    
        <!-- Use unique IDs for each element -->
        <div class="form-group">
            <label for="nameField">Your Name</label>
            <input type="text" 
            id="nameField" 
            placeholder="Enter here"
            class="form-control"
            />
        </div>

        <div class="form-group mt-2">
            <label for="contactNumberField">Your Contact Number</label>
            <input type="text" 
            id="contactNumberField" 
            placeholder="Enter here"
            class="form-control"
            />
        </div>

        <div class="form-group mt-2">
            <label for="addressField">Your Address</label>
            <textarea
            id="addressField" 
            placeholder="Enter here"
            class="form-control"
            rows="5"
            ></textarea>
        </div>
        <div class="form-group mt-3">
            <label for="">select your photo</label>
           <input id="imgField" type="file" class="form-control" />
        </div>







        <div class="form-group">
            <label for="languagesField">Languages Known</label>
            <input type="text" 
            id="languagesField" 
            placeholder="Enter here"
            class="form-control"
            />
        </div>
        <div class="form-group">
            <label for="fbFeild">facebook platform</label>
            <input type="text" 
            id="fbFeild" 
            placeholder="Enter here"
            class="form-control"
            />
        </div>
        <div class="form-group">
            <label for="InstaFeild">insta platform</label>
            <input type="text" 
            id="INFeild" 
            placeholder="Enter here"
            class="form-control"
            />
        </div>
        <div class="form-group">
            <label for="GitFeild">git hub</label>
            <input type="text" 
            id="GitFeild" 
            placeholder="Enter here"
            class="form-control"
            />
        </div>
        <div class="form-group">
            <label for="linkedinFeild">linked IN </label>
            <input type="text" 
            id="linkedinFeild" 
            placeholder="Enter here"
            class="form-control"
            />
        </div>



        <!-- ... (other personal information fields) ... -->

        </div>

        <div class="col-md-6">
            <h3>Professional Information</h3>
            <div class="form-group mt-2">
                <label for="careerobjectiveField">Career Objective</label>
                <textarea
                    id="objectivefeild"
                    placeholder="Enter here"
                    class="form-control"
                ></textarea>
            </div>
            

            <div class="form-group mt-2" id="we">
                <label for="workExperienceField">Work Experience</label>
                <textarea
                placeholder="Enter here"
                class="form-control WeField"
                ></textarea>

                <div class="container text-center mt-2" id="weAddButton">
                    <button onclick="addNewWEField()" class="btn btn-primary btn-sm">Add</button>
                </div>
            </div>

            <div class="form-group mt-1" id="aq">
                <label for="educationQualificationsField">Education Qualifications</label>
                <textarea
                placeholder="Enter here"
                class="form-control eqfield"
                ></textarea>

                <div class="container text-center mt-3" id="aqAddButton">
                    <button onclick="addNewAQField()" class="btn btn-primary btn-sm">Add</button>
                </div>
            </div>

        
    </div>
</div>
<div class="container text-center mt-3">
    <button onclick="generateCV()" class="btn btn-primary btn-sm">
        generate CV</button>
</div>
</div>
</div>
</div>
<div class="container" id="cv-template">
<div class="container-fluid">
    <div class="row">
        <!-- First Column -->
        <div class="col-md-4 text-center py-5 Background">
            <img src="https://imgs.search.brave.com/clYM_SthIJBTEGbzZh62Mz1riEZQXm6mQc_l2kmuaqU/rs:fit:500:0:0/g:ce/aHR0cHM6Ly93YWxs/cGFwZXJzLmNvbS9p/bWFnZXMvZmVhdHVy/ZWQvcGVha3ktYmxp/bmRlcnMtcGljdHVy/ZXMtb2lvbnZncGR3/cWhhYjhrMS5qcGc"
 alt=""
 class="img-fluid myimg"
 id="imgTemplate"
 /><p id="nameT1">ruhulla baig</p>
 <p id="contactT">6304327147,9398516784</p>
 <p id="languageT">telugu,hindi,english</p>
 <p id="adressT">15-226\1 sambasivaro street sanath nagar kanuru vijayawada andhra pradesh</p><b><hr><hr></b><p>
    <a id="instaT" href="#2"></a><br>
    <a id="fbT" href="#3"></a><br>
    <a id="gitT1" href="#4"></a><br>
    <a id="linkedinT1" href="#5"></a>
    
</p>
           
        </div>

        <!-- Second Column -->
        <div class="col-md-7 py-5">
            <h1 id="nameT2" class="text-center style="font-weight:980;>Ruhulla baig</h1>
<!--1 career objective-->
            <div class="card mt-4">
                <div class="card-header ruhulla">
                    <h3> career objective</h3>
                </div>
                <div class="card-body">
                    <p id="objectiveT1">Lorem ipsum dolor sit amet consectetur adipisicing elit. Corporis, unde in! Aspernatur laboriosam omnis error quod sed numquam eaque fugiat, iusto quibusdam, soluta optio quas. Delectus odit exercitationem enim, quo nobis iste nulla voluptas nemo maxime cupiditate vel debitis optio eos aut ipsam distinctio deleniti? Accusamus, aut. Ut, distinctio corporis.</p>


                    </p>
                </div>

            </div>
            <div class="card mt-4">
                <div class="card-header ruhulla">
                  <h3> Work experience</h3>
                </div>
                <div class="card-body">
                  <ul id="workexperiencetag">
                    <li> Lorem ipsum dolor sit, amet consectetur adipisicing elit. Doloribus, labore!</li>
                    <li> Lorem ipsum dolor sit, amet consectetur adipisicing elit. Doloribus, labore!</li>
                  </ul>
                </div>
              </div>
              
        <!--academic-->
        <div class="card mt-2">
            <div class="card-header ruhulla">
                <h3>acedamic qualification</h3>
            </div>
            <div class="card-body">
               <vl id="aqT"><li>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Doloribus, labore!</li>
                <vl><li>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Doloribus, labore!</li>
                    <vl><li>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Doloribus, labore!</li>
                </p>
            </div>

        </div>
        
        <div class="container mt-3 text-center">
            <button onclick="printCV()" class="btn ruhulla">
                print cv
            </button>
        </div>
        
    </div>
</div>
</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<script src="script.js"></script>
</body>
</html>