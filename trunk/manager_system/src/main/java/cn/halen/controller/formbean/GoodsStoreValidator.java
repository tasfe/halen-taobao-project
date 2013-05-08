package cn.halen.controller.formbean;

public class GoodsStoreValidator extends BaseValidator {
	private GoodsStore goodsStore;

	public GoodsStoreValidator(GoodsStore goodsStore) {
		this.goodsStore = goodsStore;
	}
	public void doValidate() {
		validNotNegative(goodsStore.getThity_eight(), "38��ֵ����С��0");
		validNotNegative(goodsStore.getThity_nine(), "39��ֵ����С��0");
		validNotNegative(goodsStore.getForty(), "40��ֵ����С��0");
		validNotNegative(goodsStore.getForty_one(), "41��ֵ����С��0");
		validNotNegative(goodsStore.getForty_two(), "42��ֵ����С��0");
		validNotNegative(goodsStore.getForty_three(), "43��ֵ����С��0");
		validNotNegative(goodsStore.getForty_four(), "44��ֵ����С��0");
	}
}
