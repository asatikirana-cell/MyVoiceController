MyVoiceController v4.7 neural wake-word model contract

Optional private model: wake_word.tflite
Input: float32 [1,80,200,1]
Output: float32 [1,2]
Output class 0 = not wake; class 1 = wake.

The app converts a short PCM16 speech sample to a compact log-energy feature
representation. A production model must be trained/evaluated specifically for
this feature contract and the chosen phrase (for example, "Hey My Voice").
Do not use an arbitrary classifier. Keep model weights licensed for your use.

If no compatible model is imported, the application uses the existing
SpeechRecognizer phrase gate. No wake model is uploaded to any server.
