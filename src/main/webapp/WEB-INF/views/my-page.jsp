<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<body>
 <p>URI: ${uri} <br/>
 User :  ${user} <br/>
 roles:  ${roles} <br/><br/>
 <a href="/spring-mvc-orm-dao-aop/spring-mvc/security/admin/">/admin/</a><br/>
 <a href="/spring-mvc-orm-dao-aop/spring-mvc/security/users/">/users/</a><br/>
 <a href="/spring-mvc-orm-dao-aop/spring-mvc/security/others/">/others/</a><br/>
 <a href="/spring-mvc-orm-dao-aop/spring-mvc/security/quests/">/quests/</a><br/><br/>
 </p>
 <form action="/spring-mvc-orm-dao-aop/spring-mvc/logout" method="post">
     <input type="hidden"
            name="${_csrf.parameterName}"
            value="${_csrf.token}"/>
  <input type="submit" value="Logout">
</form>
</body>
</html>