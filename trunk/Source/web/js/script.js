/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function fnFocus(id,display)
{
    //alert('This function worked');
    var it = document.getElementById(id);
    it.style.borderColor = "Red";
    it.style.background = 'Yellow';
    document.getElementById(display).textContent = "";
}

function fnLostFocus(id,display)
{
    var objTXT = document.getElementById(id);    
    objTXT.style.borderColor = '#ABC8F2';
    objTXT.style.background = 'white';    
    
    var text = objTXT.value;
    if(text.toString()==""){
        document.getElementById(display).textContent = id+" không được trống";
    }else{
        document.getElementById(display).textContent = "";
    }

    if(id=='repass'){
        var pass = document.getElementById('password');
        if(objTXT.value!=pass.value){
            document.getElementById(display).textContent = "password không trùng";
        }
    }
/*
    if(id=='email'){
        var email = document.getElementById(id);
        if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email.value)){

        }else{
            document.getElementById(display).textContent='Email không hợp lệ';
        }
    }
*/
}

function checkEmail() {
    var email = document.getElementById('email');
    if ((/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email.value))){
        return true;
    }
    return false;
}

function checkForm(){
    var rs = true;
    var message = "";
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    var repassword = document.getElementById('repass').value;
    var fullname = document.getElementById('fullname').value;
    var email = document.getElementById('email').value;

    if(username=="")
        message +=message+ "Hãy chọn tên đăng nhập<br>";
    if(password==""){
        message += "Nhập mật khẩu<br>";
        rs = false;
    }
    if(repassword==""){
        message += "Nhập lại mật khẩu<br>";
        rs = false;
    }
    if(fullname==""){
        message += "Nhập Họ tên đầy đủ<br>";
        rs = false;
    }
    if(email==""){
        message += "Nhập email để kích hoạt tài khoản<br>";
        rs = false;
    }
    if(!checkEmail()){
        message += "Email không hợp lệ<br>";
        rs = false;
    }
    if(password!=repassword){
        message += "Mật khẩu không trung nhau<br>";
        rs = false;
    }
    if(!rs){
        document.getElementById('message').innerHTML=message;
        return false;
    }
    return true;
}
