package com.neo.valtrys.AllDemos;

public class h {
    /*
    Question 1:
Given the following HTML code snippet, create an xpath that selects the "li" elements that contain the text "Example":
<ul>
 <li>First Example</li>
 <li>Second Example</li>
 <li>Third</li>
 <li>Fourth Example</li>
 <li>Fifth</li>
</ul>

//li[contains(text(),'Example')]

2. Given the following HTML code snippet, create an xpath that selects the "input" element whose "id" attribute starts with the text "username":
<form>
 <label for="username-input">Username:</label>
 <input type="text" id="username-input" name="username">
 <label for="password-input">Password:</label>
 <input type="password" id="password-input" name="password">
 <input type="submit" value="Submit">
</form>

//input[starts-with(@id, 'username')]

Question 3:
Given the following HTML code snippet, create an xpath that selects the "img" element whose "alt" attribute contains the text "example":
<div>
 <img src="example.png" alt="Example Image">
 <p>Some text here</p>
 <img src="test.png" alt="Test Image">
</div>

//img[contains(@alt= 'example')]

Question 4:
Given the following HTML code snippet, create an xpath that selects the "td" element that immediately follows the "th" element with the text "Name":
<table>
 <tr>
  <th>Name</th>
  <th>Age</th>
  <th>Gender</th>
 </tr>
 <tr>
  <td>John</td>
  <td>30</td>
  <td>Male</td>
 </tr>
 <tr>
  <td>Jane</td>
  <td>25</td>
  <td>Female</td>
 </tr>
</table>

//th[text()='Name']
/table/tr/th[1]

Question 5:
Given the following HTML code snippet, create an xpath that selects the "a" element whose "href" attribute starts with the text "https" and whose "rel" attribute contains the text "external":
<ul>
 <li><a href="https://www.example.com" rel="nofollow">Example</a></li>
 <li><a href="http://www.google.com" rel="external">Google</a></li>
 <li><a href="https://www.facebook.com" rel="external nofollow">Facebook</a></li>
</ul>
//a[contains(@rel, 'external')]

Question 6:
Given the following HTML code snippet, create an xpath that selects the "div" element with the class attribute "wrapper" and whose child "p" element contains the text "Example":
<div class="container">
 <div class="wrapper">
  <h1>Heading</h1>
  <p>Example paragraph</p>
  <p>Another paragraph</p>
 </div>
</div>

//div[@class='wrapper']/p

Question 7:
Given the following HTML code snippet, create an xpath that selects the "span" element that immediately follows the "h3" element with the text "Subheading":
<div>
 <h2>Heading</h2>
 <h3>Subheading</h3>
 <span>Text</span>
 <p>Paragraph</p>
</div>

//span[text()='Text']/../

Question 8:
Given the following HTML code snippet, create an xpath that selects the "a" element that contains the text "Link 3" and whose preceding sibling "p" element contains the text "Link 2":
<div>
 <p>Link 1</p>
 <p>Link 2</p>
 <a href="#">Link 3</a>
 <p>Link 4</p>
 <p>Link 5</p>
</div>

//a[text()='Link 3']/preceding-sibiling::p[2] ????

Question 9:
Given the following HTML code snippet, create an xpath that selects the "li" element that contains the text "Fifth Example" and whose parent "ul" element has the class attribute "example-list":
<ul class="example-list">
 <li>First Example</li>
 <li>Second Example</li>
 <li>Third Example</li>
 <li>Fourth Example</li>
 <li>Fifth Example</li>
</ul>

//li[text()='Fifth Example']/..

Question 10:
Given the following HTML code snippet, create an xpath that selects the "input" element whose "name" attribute starts with the text "user" and whose following sibling "label" element contains the text "Password":
<form>
 <label for="username-input">Username:</label>
 <input type="text" id="username-input" name="username">
 <label for="password-input">Password:</label>
 <input type="password" id="password-input" name="password">
 <input type="submit" value="Submit">
</form>


     */
}
