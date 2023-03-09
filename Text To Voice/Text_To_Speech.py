from gtts import gTTS 
from playsound import playsound

mytext = 'Welcome to the future'  

print(mytext)

# Change voice into woman
myobj = gTTS(text=mytext, lang='en', slow=False) 

# Save it using name welcome
myobj.save("welcome.mp3") 

# Play the sound
playsound("welcome.mp3")
