package cn.halen.exception;

public class UpdateZeroException extends Exception {

	/**
	 * ����Ӱ��0����¼����������Ϊ���Ƕ�ȡһ����¼�Ժ� ��ȥ���´�����¼ʱ��������¼�ѱ������޸���
	 */
	private static final long serialVersionUID = 1L;
	public UpdateZeroException(String msg) {
		super(msg);
	}
}
