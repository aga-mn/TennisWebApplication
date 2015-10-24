<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="menu">
  Menu
  <ul>
      <li>
          <spring:url value="/home" var="homeUrl" htmlEscape="true"/>
          <a href="${homeUrl}">Home</a>
      </li>
      <li>
          <spring:url value="/login" var="homeUrl" htmlEscape="true"/>
          <a href="${homeUrl}">Login</a>
      </li>

      <li>
          <spring:url value="/PlayerProfile" var="PlayerProfileUrl" htmlEscape="true"/>
          <a href="${PlayerProfileUrl}">PlayerProfile</a>
      </li>

      <li>
          <spring:url value="/club" var="clubUrl" htmlEscape="true"/>
          <a href="${clubUrl}">Dodaj klub</a>
      <li>
          <spring:url value="/about" var="aboutUrl" htmlEscape="true"/>
          <a href="${aboutUrl}">About</a>
      </li>
      <li>
          <spring:url value="/jquery_smp" var="jquery_smpUrl" htmlEscape="true"/>
          <a href="${jquery_smpUrl}">Jquerry</a>
      </li>
      <li>
          <spring:url value="/autocompli" var="autocompliUrl" htmlEscape="true"/>
          <a href="${autocompliUrl}">autocompli</a>
      </li>

      <li>
          <spring:url value="/draw" var="draw_smpUrl" htmlEscape="true"/>
          <a href="${jquery_smpUrl}">draw</a>
      </li>
      <li>
          <spring:url value="/tournament" var="tournamentUrl" htmlEscape="true"/>
          <a href="${tournamentUrl}">Dodaj turniej</a>
      </li>
      <li>
          <spring:url value="/ranking" var="rankingUrl" htmlEscape="true"/>
          <a href="${rankingUrl}">Dodaj ranking</a>
      </li>
      <li>
          <spring:url value="/match" var="matchUrl" htmlEscape="true"/>
          <a href="${matchUrl}">Dodaj mecz</a>
      </li>
  </ul>
</div>