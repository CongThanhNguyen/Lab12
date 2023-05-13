<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<form action="/lab12/bai-3/add" method="post">
    <div>
        <span>Ma Lop</span>
        <input type="text" name="ma">
    </div>

    <div>
        <span>Ten Lop</span>
        <input type="text" name="ten">
    </div>
    <div>
        <span>Mon Hoc</span>
        <input type="text" name="mon">
    </div>
    <div>
        <span>Ca Hoc</span>
        <input type="radio" name="ca"> 1
        <input type="radio" name="ca"> 2
    </div>
    <div>
        <span>Phong Hoc</span>
        <select name="phong">
            <option value="">P301</option>
            <option value="">P302</option>
            <option value="">P303</option>
            <option value="">P304</option>
            <option value="">P305</option>
        </select>
    </div>

    <button type="submit"> Them</button>
</form>
<table border="1">
    <tr>
        <td>Ma</td>
        <td>ten</td>
        <td>mon</td>
        <td>ca</td>
        <td>phong</td>
    </tr>
    <c:forEach items="${lopHocs}" var="lp">
        <tr>
            <td>${lp.maLop}</td>
            <td>${lp.tenLop}</td>
            <td>${lp.monHoc}</td>
            <td>${lp.caHoc ? "1":"2"}</td>
            <td>${lp.phongHoc}</td>

        </tr>
    </c:forEach>
</table>