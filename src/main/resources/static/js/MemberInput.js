  let isIdAvailable = false;

     document.addEventListener("DOMContentLoaded", () => {
         const idCheckBtn = document.getElementById("idck");
         const idInput = document.getElementById("memberid");

         idCheckBtn.addEventListener("click", async () => {
             const id = idInput.value.trim();

             if (!id) {
                 alert("아이디를 입력해주세요.");
                 idInput.focus();
                 return;
             }

             try {
                 const response = await fetch("/idcheck1", {
                     method: "POST",
                     headers: {
                         "Content-Type": "application/x-www-form-urlencoded"
                     },
                     body: new URLSearchParams({ id: id })
                 });

                 const result = await response.text();

                 if (result === "ok") {
                     alert("사용 가능한 아이디입니다.");
                     isIdAvailable = true;
                 } else {
                     alert("이미 사용중인 아이디입니다.");
                     isIdAvailable = false;
                     idInput.focus();
                 }
             } catch (error) {
                 console.error("ID 확인 오류:", error);
             }
         });
     });