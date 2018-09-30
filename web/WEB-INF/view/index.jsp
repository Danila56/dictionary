<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/addWord">
    <input type="text" name="word" placeholder="Введите слово" size="20">
    <input type="text" name="translation" placeholder="Введите перевод" size="45">
    <input type="submit" value="Добавить слово">
  </form>

  <table>
      <thead>
      <tr>
          <th>ID</th>
          <th>Word</th>
          <th>Translation</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach items="${wordsList}" var="word">
          <tr>
              <td>${word.id}</td>
              <td>${word.word}</td>
              <td>${word.translation}</td>
          </tr>
      </c:forEach>
      </tbody>
  </table>
  </body>
</html>
