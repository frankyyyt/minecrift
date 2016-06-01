package jopenvr;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VR_IVRExtendedDisplay_FnTable extends Structure {
	/** C type : GetWindowBounds_callback* */
	public VR_IVRExtendedDisplay_FnTable.GetWindowBounds_callback GetWindowBounds;
	/** C type : GetEyeOutputViewport_callback* */
	public VR_IVRExtendedDisplay_FnTable.GetEyeOutputViewport_callback GetEyeOutputViewport;
	/** C type : GetDXGIOutputInfo_callback* */
	public VR_IVRExtendedDisplay_FnTable.GetDXGIOutputInfo_callback GetDXGIOutputInfo;
	public interface GetWindowBounds_callback extends Callback {
		void apply(IntByReference pnX, IntByReference pnY, IntByReference pnWidth, IntByReference pnHeight);
	};
	public interface GetEyeOutputViewport_callback extends Callback {
		void apply(int eEye, IntByReference pnX, IntByReference pnY, IntByReference pnWidth, IntByReference pnHeight);
	};
	public interface GetDXGIOutputInfo_callback extends Callback {
		void apply(IntByReference pnAdapterIndex, IntByReference pnAdapterOutputIndex);
	};
	public VR_IVRExtendedDisplay_FnTable() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("GetWindowBounds", "GetEyeOutputViewport", "GetDXGIOutputInfo");
	}
	/**
	 * @param GetWindowBounds C type : GetWindowBounds_callback*<br>
	 * @param GetEyeOutputViewport C type : GetEyeOutputViewport_callback*<br>
	 * @param GetDXGIOutputInfo C type : GetDXGIOutputInfo_callback*
	 */
	public VR_IVRExtendedDisplay_FnTable(VR_IVRExtendedDisplay_FnTable.GetWindowBounds_callback GetWindowBounds, VR_IVRExtendedDisplay_FnTable.GetEyeOutputViewport_callback GetEyeOutputViewport, VR_IVRExtendedDisplay_FnTable.GetDXGIOutputInfo_callback GetDXGIOutputInfo) {
		super();
		this.GetWindowBounds = GetWindowBounds;
		this.GetEyeOutputViewport = GetEyeOutputViewport;
		this.GetDXGIOutputInfo = GetDXGIOutputInfo;
	}
	public VR_IVRExtendedDisplay_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRExtendedDisplay_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRExtendedDisplay_FnTable implements Structure.ByValue {
		
	};
}
