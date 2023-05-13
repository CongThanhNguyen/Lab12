<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form action="/lab12/bai-1" method="post">
    <div>
        <span>Diem lab</span>
        <input type="number" name="lab">
    </div>

    <div>
        <span>Diem quizz</span>
        <input type="number" name="quizz">
    </div>

    <div>
        <span>Diem ass</span>
        <input type="number" name="ass">
    </div>
    <div>
        <span>Diem final</span>
        <input type="number" name="finall">
    </div>
    <button type="submit"> xac nhan</button>
</form>
<h1>ket qua: ${ketQua}</h1>