import webbrowser
import time
import string
import random
 
N = 7

 
questions = [str(i) for i in range(1, 11)]

for question in questions:
    
    res = ''.join(random.choices(string.ascii_uppercase +string.digits, k=N))
    

    url = "https://www.bing.com/"+question.replace(' ', '+')+res

    # Open a new browser tab with the search URL
    webbrowser.open_new_tab(url)
    time.sleep(30)
    



from selenium import webdriver

# Open Chrome browser
driver = webdriver.Edge()

# Navigate to a website
driver.get("https://www.bings.com")

# Find the search input element by its name attribute
search_input = driver.find_element_by_name("q")

# Type a search query
search_input.send_keys("Selenium tutorial")

# Submit the search query
search_input.submit()

from selenium import webdriver
from selenium.webdriver.common.keys import Keys
d = webdriver.Chrome('/path/to/chromedriver')
books = ['9780062457738']
for book in books:
  d.get('https://www.bol.com/nl/')
  e = d.find_element_by_id('searchfor')
  e.send_keys(book)
  e.send_keys(Keys.ENTER)
