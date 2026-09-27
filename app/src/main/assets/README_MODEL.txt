Optional speaker_embedding.tflite model

Place a compatible, licensed TensorFlow Lite speaker-embedding model here.
Expected input: float32 [1,80,200,1]
Expected output: float32 [1,192]

The application falls back to its deterministic acoustic embedding if this
model is absent. Do not use an arbitrary TFLite model: its feature extractor,
input shape, output semantics, and license must match this integration.
