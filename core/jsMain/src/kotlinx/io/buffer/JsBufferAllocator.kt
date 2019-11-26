package kotlinx.io.buffer

import org.khronos.webgl.*

actual object PlatformBufferAllocator : BufferAllocator by JsBufferAllocator()

actual object UnmanagedBufferAllocator : BufferAllocator by JsBufferAllocator()

internal class JsBufferAllocator : BufferAllocator {
    override fun allocate(size: Int): Buffer = Buffer.of(ArrayBuffer(size))
    override fun free(instance: Buffer) {}
}
