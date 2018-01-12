package com.td;

public final class StringArray {

	public static final String PATTERN_ZH_YYYY_MM_DD = "\\d{4}年\\s?\\d{1,2}月\\d{1,2}日|待处理|尚待處理";
	public static final String PATTERN_ZH_YYYY_MM_DD_WEEKDATE = "\\d{4}年\\s?\\d{1,2}月\\s?\\d{1,2}日 \\((星期|週)[一|二|三|四|五|六|日|天]\\)";
	public static final String PATTERN_ZH_MM_YYYY = "\\d{4}年\\s?\\d{1,2}月";
	public static final String PATTERN_ZH_YYYY_MM_DD_TODAY = "\\d{4}年\\s?\\d{1,2}月\\s?\\d{1,2}日 \\((今天|今日)\\)";
	public static final String PATTERN_ZH_YY_MM_DD_HOUR = "\\d{4}年\\s?\\d{1,2}月\\d{1,2}日.*";
	public static final String PATTERN_ZH_YYYY_MM_DD_RANGE = "\\d{4}年\\s?\\d{1,2}月\\d{1,2}日 – (\\d{4}年)*\\d{1,2}月\\d{1,2}日";

	public static final String[] ARRAY_HOME_HEADER = { "Home", "Accueil", "首页", "首頁" };
	public static final String[] ARRAY_MF_FUNDS = { "Fund", "Fonds", "基金", "基金" };
	public static final String[] ARRAY_MF_SELECT_FUNDS = { "Select a fund", "Sélectionner un fonds", "选择基金", "選擇基金" };
	public static final String[] ARRAY_MF_PURCHASE_HEADER = { "Purchase Mutual Funds", "Achat de fonds", "购买互惠基金",
			"購買互惠基金" };
	public static final String[] ARRAY_MF_AMOUNT = { "Amount", "Montant", "金额", "金額" };
	public static final String[] ARRAY_MF_FROM_ACCOUNT = { "From Account", "Compte d’origine", "转出账户", "轉出賬戶" };
	public static final String[] ARRAY_MF_TO_ACCOUNT = { "To Mutual Fund Account", "Compte de fonds", "转入互惠基金账户",
			"轉入互惠基金賬戶" };
	public static final String[] ARRAY_MF_CONTACT_INFO = { "CONTACT INFORMATION", "COORDONNÉES", "联系方式", "聯絡資訊" };
	public static final String[] ARRAY_MF_EMAIL = { "Email", "Adresse courriel", "电子邮件", "電郵地址" };
	public static final String[] ARRAY_MF_PHONE = { "Phone Number", "Numéro de téléphone", "电话号码", "電話號碼" };
	public static final String[] ARRAY_MF_COPY_TEXT = {
			"We only use your information to contact you about your purchase.",
			"Vos renseignements seront uniquement utilisés pour communiquer avec vous au sujet de votre achat.",
			"您的个人信息仅用于我们就您的基金购买情况与您联络。", "我們僅在因有關您的購買時，才會使用您的資訊與您聯絡。" };
	public static final String[] ARRAY_MF_VIEW_FUND_FACT = { "View Fund Facts (Performance & Fees)",
			"Consulter l’Aperçu du fonds (rendement et frais)", "查看基金概况（表现和费用）", "查看基金概況（表現和費用）" };
	public static final String[] ARRAY_MF_CONTENT_RADIO = {
			"I consent to receiving the Fund Details and Fees electronically and I acknowledge I've had the opportunity to review them prior to purchasing the fund.I acknowledge that I may be charged a short term trading fee of up to 2% of my purchase cost if I switch or redeem my Funds (except the Money Market Funds).Please note: This fee does not apply to Fund units purchased through distribution / dividend reinvestment. Short term trading fees are paid directly to the Fund. You can refer to the applicable fund facts or the simplified prospectus for further details.",
			"Je consens à recevoir les renseignements au sujet du fonds et des frais par voie électronique et je reconnais que j’ai eu l’occasion de les examiner avant d’investir dans le fonds.Je comprends que je pourrais devoir payer des frais d’opérations à court terme s’élevant jusqu’à 2 % du coût d’achat si je substitue ou rachète des parts du fonds (sauf dans le cas d’un Fonds du marché monétaire).Remarque : Ces frais ne s’appliquent pas aux parts de fonds achetés dans le cadre d’un régime deréinvestissement des distributions ou des dividendes. Les frais d’opérations à court terme sont versés directement dans le fonds. Vous pouvez consulter l’aperçu du fonds ou le prospectus simplifié pertinent pour plus de précisions.",
			"我同意通过电子方式获取基金概况和费用，并确认我有机会在购买基金之前查阅基金概况和费用。我同意，如果我转换或赎回基金（货币市场基金除外），我可能需要支付不超过购买成本2%的短期交易费。请注意：此费用不适用于通过分红/股息再投资购买的基金单位。短期交易费将直接支付给基金。请参阅相关基金概况或简化招股说明书了解更多详情。",
			"我同意以電子方式獲取基金詳情和費用，並確認我在購買基金前都有機會先查閱內容。本人確認了解，如果我轉換或贖回基金（貨幣市場基金除外），我可能需要支付不超過購買成本2%的短期交易費。註：此費用不適用於透過分紅/股息再投資所購買的基金單位。短期交易費將直接支付給基金。請參閱相關基金概況或簡化版招股章程以了解更多詳情。" };
	public static final String[] ARRAY_MF_PREVIEW_PURCHASE_HEADER = { "Preview Purchase", "Aperçu", "预览购买", "預覽購買" };
	public static final String[] ARRAY_MF_ERROR_NO_FUND_SELECTED = { "Please Select a Fund",
			"Veuillez sélectionner un fonds", "请选择一支基金", "請選擇基金" };
	public static final String[] ARRAY_MF_BANNER_INFO = {
			"You can make a purchase 24-hours a day, 7 days a week.Purchases made before 3:00PM EST on a business day will be processed at that day's rate.If you make a purchase after 3:00PM EST, or on the weekend, it will be processed at the next business day's closing price.All purchases usually take a few days to confirm.",
			"Vous pouvez effectuer un achat en tout temps.Les achats effectués avant 15 h (HE) un jour ouvrable seront traitées au prix en vigueur à cette date.Les achats effectués après 15 h (HE) ou la fin de semaine seront traités au prix de clôture du jour ouvrable suivant.La confirmation des achats prend normalement quelques jours.",
			"每周七天、每天 24 小时，您都可以进行购买。如果在工作日东部时间下午 3 点之前购买，将按当天价格交易。如果在东部时间下午 3 点之后或在周末购买，将按照下一个工作日的收市价交易。所有购买通常均需要数天的时间进行确认。",
			"每週七天、每天 24 小時，您都可以購買。如果在工作日的東部時間下午 3 時之前購買，將按當天價格交易。如果在東部時間下午 3 時之後或在週末購買，將按下一個工作日的收市價交易。所有購買通常均需要數天的時間進行確認。" };
	public static final String[] ARRAY_MF_DISCLAIMER_INFO = {
			"We only use your information to contact you about your purchase.Please make sure that all RSP and Tax Free Savings Account transactions do not exceed your allowed contribution limit.If a trade is rejected for any reason, we'll cancel it and notify you via email within one business day.You may be charged a short term trading fee of up to 2% of your purchase cost if you switch or redeem your Funds (except the Money Market Funds). This fee does not apply to Fund units purchased through distribution / dividend reinvestment. Short term trading fees are paid directly to the Fund. Please see the applicable fund facts or the simplified prospectus for further details.TD Asset Management Inc. (TDAM) pays TD Investment Services Inc. (TDIS) a trailing commission for as long as you hold units of TD Mutual Funds. It is for the services and advice provided to you. See the Fund Facts for more details.",
			"Vos renseignements seront uniquement utilisés pour communiquer avec vous au sujet de votre achat.Vérifiez qu’aucune opération visant un REER ou un CELI ne vous fera dépasser votre plafond de cotisation.Si une opération est refusée pour quelque raison que ce soit, nous l’annulerons et nous vous aviserons par courriel dans un délai d’un jour ouvrable.Vous pourriez devoir payer des frais d’opérations à court terme s’élevant jusqu’à 2 % du coût d’achat si vous substituez ou rachetez des parts du fonds (sauf dans le cas d’un Fonds du marché monétaire). Ces frais ne s’appliquent pas aux parts de fonds achetés dans le cadre d’un régime de réinvestissement des distributions ou des dividendes. Les frais d’opérations à court terme sont versés directement dans le fonds. Pour plus de précisions, veuillez consulter l’aperçu du fonds ou le prospectus simplifié pertinent.Gestion de Placements TD Inc. (GPTD) verse une commission de suivi à Services d’investissement TD Inc. en contrepartie des services et des conseils qui vous sont offerts, tant et aussi longtemps que vous détenez des parts des Fonds Mutuels TD. Veuillez vous reporter à l’aperçu du fonds pertinent pour obtenir plus de précisions.",
			"您的个人信息仅用于我们就您的基金购买情况与您联络。请确保所有注册退休储蓄计划\\(RSP\\)和免税储蓄账户\\(TFSA\\)\\s*交易不超过您允许的供款限额。如果交易出于任何原因被拒，我们将在一个工作日内取消交易并向您发送电子邮件通知。如果您转换或赎回基金\\（货币市场基金除外\\），您可能需要支付不超过购买成本2%\\s*的短期交易费。此费用不适用于通过分红/股息再投资购买的基金单位。短期交易费直接支付给基金。请参阅相关基金概况或简化招股说明书了解更多详情。*\\s*道明资产管理有限公司\\（TDAM\\）在您持有道明互惠基金单位期间向道明投资服务有限公司\\（TDIS\\）支付尾随佣金，作为其向您提供服务和咨询的费用。有关详细信息，请参阅基金概况。",
			"我們僅在因有關您的購買時，才會使用您的資訊與您聯絡。請確保所有註冊退休儲蓄計劃\\(RSP\\)和免稅儲蓄賬戶\\(TFSA\\)\\s*交易不超過您允許的供款限額。如果交易因任何原因被拒，我們將在一個工作日內取消交易並向您發送電郵通知。如果您轉換或贖回基金\\（貨幣市場基金除外\\），\\s*您可能需要支付不超過購買成本2%的短期交易費。此費用不適用於透過分紅/股息再投資所購買的基金單位。短期交易費將直接支付給基金。請參閱相關基金概況或簡化版招股章程以了解更多詳情。\\s*道明資產管理有限公司\\（TDAM\\）在您持有道明互惠基金單位期間向道明投資服務有限公司\\（TDIS\\）支付尾隨佣金，作為其向您提供服務和諮詢的費用。有關詳細信息，請參閱基金概況。" };
	public static final String[] ARRAY_TAB_BALANCE = { "Balances", "Soldes", "结余", "結餘" };
	public static final String[] ARRAY_TAB_FUND = { "Funds", "Fonds", "基金", "基金" };
	public static final String[] ARRAY_FUND_TAB_LEFT = { "FUND", "FONDS", "基金", "基金" };
	public static final String[] ARRAY_TAB_ACTIVITY = { "Activity", "Activité", "活动", "活動" };
	public static final String[] ARRAY_TAB_SUMMARY = { "Summary", "Sommaire", "概要", "摘要" };
	public static final String[] ARRAY_TABLE_DATE = { "DATE", "DATE", "日期", "日期" };
	public static final String[] ARRAY_TABLE_TRANSACTION = { "TRANSACTION", "OPÉRATION", "交易", "交易" };
	public static final String[] ARRAY_TABLE_AMOUNT = { "AMOUNT", "MONTANT", "金额", "金額" };
	public static final String[] ARRAY_TABLE_MARKET_VALUE = { "MARKET VALUE", "VALEUR MARCHANDE", "市场价值", "市價" };
	public static final String[] ARRAY_TABLE_UNIT = { "UNITS", "PARTS", "单位", "單位" };
	public static final String[] ARRAY_TABLE_PRICE_PER_UINT = { "PRICE PER UNIT", "PRIX PAR PART", "单位价格", "單位價格" };
	public static final String[] ARRAY_MF_PURCHASE_BUTTON = { "PURCHASE MUTUAL FUNDS", "ACHETER DES FONDS COMM.",
			"购买互惠基金", "購買互惠基金" };
	public static final String[] ARRAY_MF_CANADIAN_DOLLAR_NOTE = {
			"All values in Canadian Dollars unless otherwise stated",
			"Toutes les valeurs sont en dollars canadiens, sauf avis contraire", "除非另有说明，否则所有金额均为加元",
			"所有金額均為加元，除非另有說明" };
	public static final String[] ARRAY_MF_RECEIPT_HEADER = { "Receipt", "Reçu", "收据", "收據" };
	public static final String[] ARRAY_MF_THANKYOU = { "Thank you!", "Merci!", "谢谢！", "謝謝您！" };
	public static final String[] ARRAY_MF_RECEIPT_REPLY = { "We're working on your purchase.",
			"Nous traitons votre achat.", "我们已经开始处理您的购买。如有问题，我们将与您联系。", "我們已開始處理您的購買。如有問題，我們將與您聯絡。" };
	public static final String[] ARRAY_MF_NEXT_HAPPEN = { "WHAT HAPPENS NEXT", "PROCHAINES ÉTAPES", "后续流程", "後續流程" };
	public static final String[] ARRAY_MF_PURCHASE_BEFORE3 = { "Purchases made before 3:00PM",
			"Achats effectués avant 15 h", "下午 3 点之前的购买 ", "下午 3 時之前的購買" };
	public static final String[] ARRAY_MF_CONTENT_BEFORE3 = {
			"If you made your purchase before 3:00PM EST on a business day, it will be processed at that day's rate.",
			"Si vous avez effectué votre achat avant 15 h (HE) un jour ouvrable, il sera traité au prix en vigueur à cette date.",
			"如果您在工作日东部时间下午 3 点之前购买，将按当天价格交易。", "如果在工作日的東部時間下午 3 時之前購買，將按當天價格交易。" };

	public static final String[] ARRAY_MF_PURCHASE_AFTER3 = { "Purchases made after 3:00PM",
			"Achats effectués après 15 h", "下午 3 点之后的购买 ", "下午 3 時之後的購買" };
	public static final String[] ARRAY_MF_CONTENT_AFTER3 = {
			"If you made your purchase after 3:00PM EST, or on the weekend, it will be processed at the next business day's closing price.",
			"Si vous avez effectué votre achat après 15 h (HE) ou la fin de semaine, il sera traité au prix de clôture du jour ouvrable suivant.",
			"如果您在东部时间下午 3 点之后或在周末购买，将按照下一个工作日的收市价交易。", "如果在東部時間下午 3 時之後或在週末購買，將按下一個工作日的收市價交易。" };
	public static final String[] ARRAY_MF_PURCHASE_CONFIRM = { "Purchase confirmation", "Confirmation d’achat", "购买确认",
			"購買確認" };
	public static final String[] ARRAY_MF_CONFIRM_DESCRIPTION = {
			"Once we've completed your purchase, you'll see the new funds reflected in your mutual fund account balance.",
			"Une fois le traitement de votre achat terminé, les nouveaux fonds seront reflétés dans le solde de votre compte de fonds communs de placement.",
			"我们处理完您的购买之后，您能够即刻在您的互惠基金账户结余中看到新的基金。", "我們處理完您的購買之後，您便能在您的互惠基金賬戶結餘中看到新的基金。" };
	public static final String[] ARRAY_MF_PURCHASE_DETAILS = { "PURCHASE DETAILS", "DÉTAIL DE L’ACHAT", "购买详情",
			"購買詳情" };
	public static final String[] ARRAY_MF_PURCHASE_REF_NUM = { "Reference Number", "Numéro de référence", "参考编号",
			"參考號碼" };
	public static final String[] ARRAY_MF_PURCHASE_REQUEST_TIME = { "Request Sent", "Date de la demande", "发送请求时间",
			"請求送出時間" };
	public static final String[] ARRAY_MF_RECEIPT_BALANCE_NOTE = {
			"Your account balance does not reflect your fund purchase. Once we've finished processing your purchase, your account balance will be updated.",
			"Le solde de votre compte ne reflète pas encore votre achat. Une fois que nous aurons terminé de traiter votre achat, le solde de votre compte sera mis à jour.",
			"您的账户结余没有显示您购买的基金。我们处理完您的购买后，您的账户结余将会即刻更新。", "您的賬戶結餘沒有顯示您購買的基金。我們處理完您的購買後，您的賬戶結餘便會更新。" };

	public static final String[] ARRAY_MF_RECEIPT_GO_HOME_BTN = { "GO BACK HOME", "RETOUR À L’ACCUEIL", "返回主页",
			"返回首頁" };
	public static final String[] ARRAY_MF_RECEIPT_VIEW_ACCOUNT_BTN = { "VIEW MY ACCOUNTS", "CONSULTER MES COMPTES",
			"查看我的账户", "查看我的賬戶" };
	public static final String[] ARRAY_MF_ACCEPTED_FUND_DETAIL_FEE = { "Accepted Fund Details & Fees",
			"Infos sur le fonds et les frais acceptées", "已接受的基金 详情与费用", "已接受的基金 詳情與費用" };
	public static final String[] ARRAY_MF_FUND_FACT = { "Fund Facts", "Aperçu du fonds", "基金概况", "基金產品概述" };
	public static final String[] ARRAY_MF_FUND_FACT_PDF = { "fund facts.pdf", "Aperçu du fonds.pdf", "基金概况.pdf",
			"基金概況.pdf" };
	public static final String[] ARRAY_MF_TRANSACTION_DETAIL = { "Transaction Details", "Détails de l’opération",
			"交易详情", "交易詳情" };
	public static final String[] ARRAY_MF_TRANSACTION_DATE = { "Date", "Date", "日期 ", "日期 " };
	public static final String[] ARRAY_MF_TRANSACTION_TYPE = { "Transaction Type", "Type d’opération", "交易类型",
			"交易類型常" };
	public static final String[] ARRAY_MF_TRANSACTION_GROSS_AMOUNT = { "Gross Amount", "Montant brut", "总金额", "總金額" };
	public static final String[] ARRAY_MF_TRANSACTION_CHARGE = { "Transaction Charge", "Frais d’opération", "交易收费",
			"交易費用" };
	public static final String[] ARRAY_MF_TRANSACTION_NET_AMOUNT = { "Net Amount", "Montant net", "净额", "淨額" };
	public static final String[] ARRAY_MF_TRANSACTION_UNIT_PRICE = { "Unit Price", "Prix par part", "单位价格", "單位價格" };
	public static final String[] ARRAY_MF_TRANSACTION_UNIT = { "Transaction Units", "Parts visées par l’opération",
			"交易单位数量", "交易單位數" };
	public static final String[] ARRAY_MF_NONELIGIBAL_ERROR_MSG = {
			"Looks like you're not set up to purchase mutual funds. Let us help you by calling 1-888-568-0951.",
			"Il semble que vous ne puissiez pas effectuer d’achats. Pour obtenir de l’aide, composez le 1-888-568-0952.",
			"您似乎未启用购买互惠基金的功能。请拨打1-866-235-0002（广东话）或1-866-769-0002（普通话）获取帮助。",
			"看來您尚未設定好購買互惠基金。請致電我們以獲得協助；廣東話：1-866-235-0002，普通話： 1-866-769-0002。" };
	public static final String[] ARRAY_MF_CLOASED_ACCOUNT_ERROR_MSG = {
			"Looks like the account you are using is closed. Try another fund or let us help you by calling 1-888-568-0951.",
			"Il semble que le compte est fermé. Essayez avec un autre fonds, ou appelez-nous au 1-888-568-0952 pour obtenir de l’aide.",
			"您使用的账户似乎已关闭。请拨打1-866-235-0002（广东话）或1-866-769-0002（普通话）购买其他基金或获取帮助。",
			"看來您使用的賬戶已關閉。請選擇另一種基金或致電我們，讓我們提供協助；廣東話：1-866-235-0002，普通話：1-866-769-0002。" };
	public static final String[] ARRAY_MF_FUND_DETAIL_PURCHASE = { "Purchase", "Acheter", "买入", "買入" };
	public static final String[] ARRAY_MF_FUND_DETAIL_CALL = { "Call", "Appeler", "致电", "致電" };
	public static final String[] ARRAY_MF_FUND_DETAIL_QUOTE = { "Quote", "Cote", "报价", "報價" };
	public static final String[] ARRAY_MF_FUND_DETAIL_HEADER = { "Fund Details", "Détails sur le fonds", "基金详情",
			"基金詳情" };
	public static final String[] ARRAY_MF_FD_MARKETVALUE = { "Market Value", "Valeur marchande", "市场价值", "市場價值" };
	public static final String[] ARRAY_MF_FD_BOOKVALUE = { "Book Value", "Valeur comptable", "账面价值", "賬面價值" };
	public static final String[] ARRAY_MF_FD_PERCENTAGE_PORTFOLIO = { "Percentage of Portfolio on this Account",
			"Pourcentage du portefeuille du compte", "此账户的投资组合百分比", "此賬戶的投資組合百分比" };
	public static final String[] ARRAY_MF_FD_UNITS_HELD = { "Units Held", "Parts détenues", "所持单位数", "所持單位數" };
	public static final String[] ARRAY_MF_FD_UNIT_PRICE = { "Price Per Unit ", "Prix par part ", "单位价格", "單位價格" };
	public static final String[] ARRAY_MF_FD_GAIN_LOSS = { "Unrealized Gain/Loss", "Gains/pertes non réalisés",
			"未实现收益/亏损", "未實現收益/虧損" };
	public static final String[] ARRAY_MF_FD_VIEW_PERFORMANCE = { "View Fund Facts (Performance & Fees)",
			"Consulter l’Aperçu du fonds (rendement et frais)", "查看基金概况（表现和费用）", "查看基金概況（表現和費用）" };
	public static final String[] ARRAY_MF_PHONE_PLACEHOLDER = { "Enter number", "Entrer le numéro", "输入号码", "輸入號碼" };
	public static final String[] ARRAY_MF_EMAIL_PLACEHOLDER = { "example@address.com", "exemple@adresse.com",
			"示例 @address.com", "範例 @address.com" };
	public static final String[] ARRAY_MF_INELIGIBLE_LABEL = { "Ineligible", "Non admissible", "不符合条件", "不符合資格" };
	public static final String[] ARRAY_MF_DISCLAIMER_AND = {
			"As of [A-Za-z]{3}\\s*\\d{1,2},\\s*\\d{4} at \\d{1,2}:\\d{1,2}:\\d{1,2}.*",
			"Au .{3,5}\\s*\\d{1,2},\\s*\\d{4} à \\d{1,2}:\\d{1,2}:\\d{1,2}.*",
			"截至\\s*\\d{4}年\\s*\\d{1,2}月\\s*\\d{1,2}日*.*\\d{1,2}:\\d{1,2}:\\d{1,2}.*",
			"截至\\s*\\d{4}年\\s*\\d{1,2}月\\s*\\d{1,2}日*.*\\d{1,2}:\\d{1,2}:\\d{1,2}.*" };
	public static final String[] ARRAY_MF_DISCLAIMER_IOS = {
			"As of [A-Za-z]{3}\\s*\\d{1,2},\\s*\\d{4} at \\d{1,2}:\\d{1,2}:\\d{1,2}.*",
			"Au \\d{1,2} .{3,5}\\s*\\d{4} à \\d{1,2}:\\d{1,2}:\\d{1,2}.*",
			"有效时间至*.*\\d{4}年\\s*\\d{1,2}月\\s*\\d{1,2}日*.*\\d{1,2}:\\d{1,2}:\\d{1,2}",
			"有效至*.*\\d{4}年\\s*\\d{1,2}月\\s*\\d{1,2}日*.*\\d{1,2}:\\d{1,2}:\\d{1,2}" };
	public static final String[] ARRAY_MF_TRADE_FEE_DISCLAIMER = {
			"You may be charged a short term trading fee of up to 2% of your purchase cost if you switch or redeem your Funds (except the Money Market Funds). This fee does not apply to Fund units purchased through distribution / dividend reinvestment. Short term trading fees are paid directly to the Fund. Please see the applicable fund facts or the simplified prospectus for further details.",
			"Vous pourriez devoir payer des frais d’opérations à court terme s’élevant jusqu’à 2 % du coût d’achat si vous substituez ou rachetez des parts du fonds (sauf dans le cas d’un Fonds du marché monétaire). Ces frais ne s’appliquent pas aux parts de fonds achetés dans le cadre d’un régime de réinvestissement des distributions ou des dividendes. Les frais d’opérations à court terme sont versés directement dans le fonds. Pour plus de précisions, veuillez consulter l’aperçu du fonds ou le prospectus simplifié pertinent.",
			"如果您转换或赎回基金（货币市场基金除外），您可能需要支付不超过购买成本2%的短期交易费。此费用不适用于通过分红/股息再投资购买的基金单位。短期交易费直接支付给基金。请参阅相关基金概况或简化招股说明书了解更多详情。",
			"如果您轉換或贖回基金（貨幣市場基金除外），您可能需要支付不超過購買成本2%的短期交易費。此費用不適用於透過分紅/股息再投資所購買的基金單位。短期交易費將直接支付給基金。請參閱相關基金概況或簡化版招股章程以了解更多詳情。" };
	public static final String[] ARRAY_MF_LEGAL_TRAILING_COMMISSION = {
			"TD Asset Management Inc. (TDAM) pays TD Investment Services Inc. (TDIS) a trailing commission for as long as you hold units of TD Mutual Funds. It is for the services and advice provided to you. See the Fund Facts for more details.",
			"Gestion de Placements TD Inc. (GPTD) verse une commission de suivi à Services d’investissement TD Inc. en contrepartie des services et des conseils qui vous sont offerts, tant et aussi longtemps que vous détenez des parts des Fonds Mutuels TD. Veuillez vous reporter à l’aperçu du fonds pertinent pour obtenir plus de précisions.",
			"道明资产管理有限公司（TDAM）在您持有道明互惠基金单位期间向道明投资服务有限公司（TDIS）支付尾随佣金，作为其向您提供服务和咨询的费用。有关详细信息，请参阅基金概况。",
			"道明資產管理有限公司（TDAM）在您持有道明互惠基金單位期間向道明投資服務有限公司（TDIS）支付尾隨佣金，作為其向您提供服務和諮詢的費用。有關詳細信息，請參閱基金概況。" };
	public static final String[] ARRAY_MF_USD_CONVERSION_RATE = { "U\\.S\\. conversion rate used\\s*:\\s*\\d+\\.\\d+",
			"Taux de conversion US utilisé\\s*:\\s*\\d+\\.\\d+", "美元汇率\\s*:\\s*\\d+\\.\\d+",
			"美元匯率\\s*:\\s*\\d+\\.\\d+" };

	public static final String[] ARRAY_PROFILE_AND_PREFERENCE = { "Profile & Settings", "Profil et paramètres",
			"个人资料和设置", "個人資料和設定" };
	public static final String[] ARRAY_CUSTOMER_FEEDBACK = { "Give Feedback", "Fournir des commentaires", "发送意见回馈",
			"發送意見" };
	public static final String[] ARRAY_QUICK_ACCESS_SETTINGS = { "Quick Access Settings", "Paramètres Accès rapide",
			"特快结余查询设定", "特快結餘查詢設定" };
	public static final String[] ARRAY_QUICK_ACCESS_SWITCH_AND = { "Quick Access", "Accès rapide", "特快结余查询", "特快結餘查詢" };

	public static final String[] ARRAY_OTP_CHALLENGE_UNABLE_TO_VERIFY_CODE = {
			"we can't verify the security code entered.", "nous ne pouvons valider votre code de sécurité",
			"我们无法验证输入的安全码", "我們無法確認輸入的驗證碼" };
	public static final String[] ARRAY_OTP_CHALLENGE_TOO_MANY_SECURITY_CODES_REQUESTED = {
			"You've exceeded the number of security code requests",
			"Vous avez atteint le nombre maximal de demandes de code de sécurité", "您索取安全码的次数已超过上限", "您要求索取驗證碼的次數太多" };
	public static final String[] ARRAY_OTP_CHALLENGE_ONLINE_ACCESS_DISABLED = {
			"For your security, your online access has been disabled",
			"Pour votre sécurité, nous avons suspendu votre accès en ligne", "出于安全性考虑，您的网上访问权限已禁用",
			"基於安全考慮，您的網上存取權限已停用" };
	public static final String[] ARRAY_OTP_CHALLENGE_HEADER_TEXT = { "Security Code Required",
			"Code de sécurité requis", "须要安全码", "必須提供驗證碼" };

	public static final String[] ARRAY_OTP_SETUP_GET_STARTED = { "Get Started", "Commencer", "立即开始", "立即開始" };
	public static final String[] ARRAY_OTP_SETUP_CONTINUE = { "Continue", "Continuer", "继续", "繼續" };
	public static final String[] ARRAY_OTP_SETUP_ADD_ANOTHER_PHONE = { "Add another phone?",
			"Ajouter un autre téléphone?", "添加其他电话号码", "新增更多電話號碼" };
	public static final String[] ARRAY_OTP_SETUP_INVALID_PASSCODE_FORMAT = { "Please enter numbers only",
			"Veuillez entrer des chiffres seulement", "请仅输入数字", "請僅輸入數字" };
	public static final String[] ARRAY_OTP_SETUP_EXPIRED_PASSCODE = { "This code has expired", "Ce code a expiré",
			"此代码已失效", "此驗證碼已失效" };

	public static final String[] ARRAY_OTP_SETUP_SECURITY_EMAIL_HEADER = {
			"Please provide an email address where you’ll receive security alerts",
			"Veuillez fournir une adresse courriel pour recevoir les alertes de sécurité", "请提供一个用户接收安全信息的电子邮件邮箱地址",
			"請提供電郵地址，用來接收安全性資訊" };
	public static final String[] ARRAY_OTP_SETUP_UNABLE_DELETE_PHONE = { "Please add another number",
			"Veuillez ajouter un autre numéro", "请添加另一个号码", "請新增另一個號碼" };
	public static final String[] ARRAY_OTP_SETUP_UNABLE_DELETE_PHONE_MSG = {
			"You can’t delete your last phone number. Please add another number first, so you can get your one-time security codes for Two-Step Verification",
			"Vous ne pouvez pas supprimer votre dernier numéro de téléphone. Ajoutez d’abord un autre numéro afin de pouvoir obtenir vos codes de sécurité à usage unique pour la vérification en deux temps",
			"不允许删除上一个电话号码。请先添加另一个号码，用以接收双重认证所需的一次性验证码", "不允許刪除上一個電話號碼。請先新增另一個號碼，用以接收雙重認證所需的一次性驗證碼" };
	public static final String[] ARRAY_OTP_SETUP_PASSCODE_VERIFIED = { "Verified", "Validé", "已验证", "已驗證" };
	public static final String[] ARRAY_OTP_SETUP_SETUP_COMPLETE_HEADER = { "Setup Complete", "Configuration terminée",
			"设置完成", "設定完成" };

	public static final String[] ARRAY_OTP_UPDATE_HEADER = {
			"You can review and manage your current security settings below",
			"Vous pouvez consulter et gérer vos paramètres de sécurité ci-dessous", "您可在下方查看并管理您目前的安全设置",
			"您可在下方查看並管理您目前的安全設定" };
	public static final String[] ARRAY_OTP_UPDATE_TEST_PHONE_HEADER = { "Test Phones (optional)",
			"Test de téléphone (facultatif)", "测试电话号码（可选）", "測試電話號碼（非必要）" };
	public static final String[] ARRAY_OTP_UPDATE_VERIFY_NUMBER_SCREEN = { "Verify Number", "Vérifier le numéro",
			"验证号码", "驗證號碼" };
	public static final String[] ARRAY_OTP_UPDATE_VERIFY_NUMBER = { "Verify number", "Tester le téléphone", "验证号码",
			"驗證號碼" };
	public static final String[] ARRAY_OTP_UPDATE_LOGIN_OPTION_HEADER = { "Security Code Login Option",
			"Option d’ouverture de session", "安全码登录选项", "安全碼登入選項" };
	public static final String[] ARRAY_OTP_UPDATE_CHANGE_EMAIL_HEADER_OLD = { "Change Security Email",
			"Modifier l’adresse courriel de sécurité", "更改安全信息邮箱", "變更安全性資訊收件箱" };
	public static final String[] ARRAY_OTP_UPDATE_CHANGE_EMAIL_HEADER = { "Security Email", "Courriel de sécurité",
			"安全电子邮件", "安全電子郵件" };

	public static final String[] ARRAY_OTP_UPDATE_COMPLETE_HEADER = { "Setup Complete", "Configuration terminée",
			"设置完成", "設定完成" };

	// Apple Pay
	public static final String[] ARRAY_APPLE_PAY_LOGIN_NOW = { "Login Now", "Ouvrir une session", "立即登录", "立即登入" };

	// My Accounts
	public static final String[] ARRAY_MY_ACCOUNTS_CREDIT_HEADER_IOS = { "CREDIT", "CRÉDIT", "信用", "信用" };
	public static final String[] ARRAY_MY_ACCOUNTS_CREDIT_HEADER_ANDROID = { "CREDIT", "CRÉDIT", "信贷", "信貸" };
	public static final String[] ARRAY_MY_ACCOUNTS_BANKING_HEADER = { "BANKING", "BANCAIRES", "理财", "理財" };
	public static final String[] ARRAY_TRANSACTION_PENDING = { "Pending", "En attente", "待处理", "尚待處理" };
	public static final String[] ARRAY_MY_ACCOUNTS_QUICKLINK_PAY = { "PAY", "PAYER", "付款", "付款" };

	// Buttons
	public static final String[] ARRAY_BUTTON_CONTINUE = { "Continue", "Continuer", "继续", "繼續" };

	// Between My Accounts
	public static final String[] ARRAY_BETWEEN_MY_ACCOUNTS_HEADER = { "Between My Accounts", "Entre mes comptes",
			"我的账户间", "我的賬戶之間" };

	// Chatbot
	public static final String[] ARRAY_CHATBOT_HEADER = { "TD ChatBot", "TBD", "TBD", "TBD" };
	public static final String[] ARRAY_CHATBOT_ERROR_INELIGIBLE = { "You are not eligible to use TD Chat", "TBD", "TBD",
			"TBD" };

	// Credit
	public static final String[] ARRAY_TD_POINTS = { "TD Points", "Points TD", "TD Points", "TD Points" };
	public static final String[] ARRAY_CASH_BACK_DOLLARS = { "Cash Back Dollars", "dollars de remise",
			"Cash Back Dollars", "Cash Back Dollars" };
	public static final String[] ARRAY_TD_REWARDS_POINTS = { "TD Rewards Points", "", "TD Rewards Points",
			"TD Rewards Points" };

	// Homescreen
	public static final String[] ARRAY_HOMESCREEN_DASHBOARD_PAYNOW = { "PAY NOW", "PAYER MAINTENANT", "现在付款", "立即付款" };

	// Login
	public static final String[] ARRAY_LOGIN_USERNAME_OR_ACCESS_CARD_IOS = { "Username or Access Card",
			"Nom d’utilisateur ou numéro de carte Accès", "用户名或易通卡", "用戶名稱或易通卡" };
	public static final String[] ARRAY_LOGIN_REMEMBER_ME_ON = { "Remember me on",
			"Mémorisation des renseignements activée", "“记住我”已开启", "「記住我」已開啟" };
	public static final String[] ARRAY_LOGIN_REMEMBER_ME_OFF = { "Remember Me off",
			"Mémorisation des renseignements désactivée", "“记住我”已关闭", "「記住我」已關閉" };

	// Logout
	public static final String[] ARRAY_LOGOUT_GO_BACK_HOME = { "GO BACK", "RETOUR À", "返回主页", "返回首頁" };

	// Manage Payees
	public static final String[] ARRAY_CANADIAN_PAYEE_DELETED = { "Canadian payee has been deleted",
			"Preneur canadien supprimé", "已删除加拿大收款人", "已刪除加拿大收款人" };
	public static final String[] ARRAY_US_PAYEE_DELETED = { "U.S. payee has been deleted", "Preneur américain supprimé",
			"已删除美国收款人", "已刪除美國收款人" };

	// Menu
	public static final String[] ARRAY_INVESTING_ACCOUNTS = { "Investing Accounts", "Comptes Placements directs TD",
			"投资账户", "投資賬戶" };
	public static final String[] ARRAY_MOBILE_PAYMENT = { "TD Mobile Payment", "Paiement mobile TD", "道明移动支付",
			"道明移動支付" };

	// Pay Bill
	public static final String[] ARRAY_PAYBILL = { "Pay Bill", "Paiement de Factures", "支付账单", "支付賬單" };

	// Quick Access
	public static final String[] ARRAY_QUICK_ACCESS_VISIT_SETTINGS = { "visit Settings to activate Accounts",
			"Ajustez les paramètres afin dactiver Comptes pour laffichage Accès rapide", "请前往“设置”为账户启用特快结余查询",
			"請前往「設定」以啟用特快結餘查詢的賬戶" };

	// Receipt
	public static final String[] ARRAY_RECEIPT_DETAIL = { "-Detail", "-Détail", "-详细信息", "-詳情" };

	// Rewards
	public static final String[] ARRAY_REWARDS_VISIT_TDREWARDS = { "Visit TDRewards.com", "Visitez primestd.com",
			"前往 TDRewards.com", "前往 TDRewards.com" };
	public static final String[] ARRAY_REWARDS_PAY_WITH_REWARDS = { "Pay With Rewards", "Payez avec vos primes",
			"用奖励积分付款", "用獎勵積分付款" };

	// Trade
	public static final String[] ARRAY_TRADE_ORDER_TYPE_STOCKS_ETF = { "Stocks & ETFs", "Actions et FNB", "股票和交易所交易基金",
			"股票和交易所交易基金" };
	public static final String[] ARRAY_TRADE_SELECT_ACCOUNT = { "Select Account", "Sélectionner un compte", "选择账户",
			"選擇賬戶" };

	public static final String[] ARRAY_PRIVACY_SECURITY_LEGAL = { "Privacy, Security & Legal",
			"Confidentialité, sécurité et avis juridique", "隐私、安全与法律声明", "私隱、安全和法律聲明" };
	public static final String[] ARRAY_FORGOT_PASSWORD = { "Forgot password?", "Mot de passe oublié?", "忘记密码？",
			"忘記密碼？" };
	public static final String[] ARRAY_ALLOW_CONTACTS_OK = { "OK", "Oui", "好", "好" };
	public static final String[] ARRAY_ALLOW_CONTACTS_REFUSE = { "Cancel", "Non", "不允许", "不允許" };
	public static final String[] ARRAY_ALLOW_CONTACTS_ACCESS_HEADER = { "", "", "“TD Canada”想访问您的通讯录",
			"“TD Canada”想訪問您的通訊錄" };
	public static final String[] ARRAY_ALLOW_CONTACTS_ACCCESS_BODY = { "", "",
			"用于读取联系人信息以添加 Interac 电子转账收款人，以及添加道明服务代表为联系人。", "用於讀取聯繫人信息以添加 Interac 電子轉賬收款人，以及添加道明服務代表為聯繫人。" };
	public static final String[] ARRAY_HOME_PHONE = { "Home Phone", "N° de tél. (domicile)", "家庭电话", "住家電話" };
	public static final String[] ARRAY_WORK_PHONE = { "Work Phone", "No de tél. (travail)", "办公电话", "辦公室電話" };
	public static final String[] ARRAY_MOBILE_PHONE = { "Mobile Phone", "N° de tél. (cell.)", "移动电话", "手機電話" };
	public static final String[] ARRAY_BUSINESS_PHONE = { "Business Phone", "N° de tél. (entreprise)", "公司电话", "公司電話" };
	public static final String[] ARRAY_FAX_NUMBER = { "Fax", "Télécopieur", "传真", "傳真" };
	public static final String[] ARRAY_EXTENSION_NUMBER = { "Ext. (optional)", "Poste (facultatif)", "分机可选", "分機(可選)" };
	public static final String[] ARRAY_SAVE_BUTTON = { "Save", "Enregistrer", "保存", "儲存" };
	public static final String[] ARRAY_CLEAR_PHONE_ICON = { "Clear text", "Effacer le texte", "清除文字", "清除文字" };
	public static final String[] ARRAY_PROFILE_HEADER = { "Profile", "Profil", "个人资料", "個人資料" };

	// MIT Dashboard START
	public static final String[] ARRAY_DASHBOARD_QUICKLINK_SENDMONEY = { "SEND MONEY", "ENVOI DE FONDS", "汇款", "匯款" };
	public static final String[] ARRAY_DASHBOARD_QUICKLINK_TRANSFER = { "TRANSFER", "VIREMENT", "转账", "轉賬" };
	public static final String[] ARRAY_DASHBOARD_QUICKLINK_PAYNOW = { "PAY NOW", "PAYER MAINTENANT", "马上付款", "即刻付款" };
	public static final String[] ARRAY_DASHBOARD_QUICKLINK_DEPOSIT = { "DEPOSIT", "DÉPÔT", "存款", "存款" };
	public static final String[] ARRAY_DASHBOARD_QUICKLINK_WATCHLISTS = { "WATCHLISTS", "LISTES DE SURVEILLANCE",
			"自选股观察名单", "自選股觀察名單" };
	public static final String[] ARRAY_DASHBOARD_QUICKLINK_QUOTE = { "QUOTE", "COTE", "报价", "報價" };
	public static final String[] ARRAY_DASHBOARD_QUICKLINK_APPLEPAY = { "APPLE PAY", "APPLE PAY", "APPLE PAY",
			"APPLE PAY" }; // EN,FR,CH_SM
	// &
	// CH_TD
	// same
	// label
	// //Verify>>
	// APPLE
	// PAY
	// is
	// same
	// for
	// all
	// <<
	public static final String[] ARRAY_DASHBOARD_QUICKLINK_PAYBILL = { "PAY BILL", "PAIEMENT DE FACTURES", "支付账单",
			"支付賬單" };
	public static final String[] ARRAY_DASHBOARD_QUICKLINK_TRADE = { "TRADE", "NÉGOCIATION", "交易", "交易" };
	public static final String[] ARRAY_DASHBOARD_QUICKLINK_HOLDINGS = { "HOLDINGS", "PLACEMENTS", "持有投资", "持有投資" };
	public static final String[] ARRAY_DASHBOARD_QUICKLINK_ORDERS = { "ORDERS", "ORDRES", "订单", "交易訂單" };
	public static final String[] ARRAY_DASHBOARD_NAVROW_ACCOUNTS = { "Accounts", "Comptes", "账户", "賬戶" };
	public static final String[] ARRAY_DASHBOARD_NAVROW_TRANSFERES = { "Transfers", "Virements", "转账", "轉賬" };
	public static final String[] ARRAY_DASHBOARD_NAVROW_BILLS = { "Bills", "Factures", "账单", "賬單" };
	public static final String[] ARRAY_DASHBOARD_NAVROW_TRADE = { "Trade", "Négociation", "交易", "交易" };
	public static final String[] ARRAY_DASHBOARD_NAVROW_MARKETS = { "Markets", "Marchés", "市场", "市場" };
	public static final String[] ARRAY_DASHBOARD_NAVROW_OPENTDDIRECTINVESTINGACCOUNT = {
			"Open a Direct Investing Account", "Ouvrir un compte Placements directs TD", "市场", "市場" };
	public static final String[] ARRAY_DASHBOARD_NAVROW_QUOTE = { "Quote", "Cote", "报价", "報價" };
	public static final String[] ARRAY_DASHBOARD_NAVROW_ALERTS = { "Alerts", "Alertes", "报价", "提醒" };
	public static final String[] ARRAY_DASHBOARD_NAVROW_OPENABANKACCOUNT = { "Open a Bank Account",
			"Ouvrir un compte bancaire", "报价", "報價" };
	public static final String[] ARRAY_DASHBOARD_HOMESCREENSETTINGS = { "Home Screen Settings",
			"Paramètres de l’écran d’accueil", "主屏幕设置", "主屏幕設置" };

	public static final String[] ARRAY_DASHBOARD_HOMESCREENSETTINGSHEADERDESCRIPTION = {
			"Choose what view to show on your home screen", "Choisir l’affichage de votre écran d’accueil", "选择主屏幕视图",
			"選擇主屏幕視圖" };
	public static final String[] ARRAY_DASHBOARD_ENABLEINVESTINGVIEW = { "Enable Investing View",
			"Activer l’affichage de Placements", "启用投资视图", "啟用投資視圖" };
	public static final String[] ARRAY_DASHBOARD_ENABLEINVESTINGVIEWDESCRIPTION = {
			"Add a Watchlist, symbol search box and investing Quick Links.",
			"Ajouter une liste de surveillance, une boîte de recherche de symboles et des liens rapides sur les placements",
			"添加自选股观察名单、股票代码搜索框和投资快速连接。", "添加自選股觀察名單、股票代號搜索框和投資快速連結。" };
	public static final String[] ARRAY_DASHBOARD_INVESTINGVIEWISON = { "Investing view is now on",
			"Affichage Placements activé", "投资视图已开启", "投資視圖已開啟" };
	public static final String[] ARRAY_DASHBOARD_GOHOME = { "Go home", "Aller à l’accueil", "回到主页", "回到首頁" };
	public static final String[] ARRAY_DASHBOARD_STOCKETFs = { "Stocks & ETFs", "Actions et FNB", "股票和交易所交易基金",
			"股票和交易所買賣基金" };
	public static final String[] ARRAY_DASHBOARD_MUTUALFUNDS = { "Mutual Funds", "Fonds mutuels", "互惠基金", "互惠基金" };
	public static final String[] ARRAY_DASHBOARD_OPTIONS = { "Options", "Options", "期权", "期權" };
	public static final String[] ARRAY_DASHBOARD_ACTIONBUY = { "Buy", "Acheter", "买入", "買入" };
	public static final String[] ARRAY_DASHBOARD_ACTIONSELL = { "Sell", "Vendre", "卖出", "賣出" };
	public static final String[] ARRAY_DASHBOARD_ACTIONBUYTOOPEN = { "Buy to Open", "Achat pour ouvrir", "买入开仓",
			"買入開倉" };
	public static final String[] ARRAY_DASHBOARD_ACTIONSELLTOCLOSE = { "Sell to Close", "Vente pour fermer", "卖出平仓",
			"賣出平倉" };
	public static final String[] ARRAY_DASHBOARD_PRICEMARKET = { "Market", "Cours du marché", "市场", "市價" };
	public static final String[] ARRAY_DASHBOARD_PRICELIMIT = { "Limit", "Limite", "限价", "限價" };
	public static final String[] ARRAY_DASHBOARD_GOODTILLDAY = { "Day", "Jour", "当天有效", "當日有效" };
	public static final String[] ARRAY_DASHBOARD_MF_REINVESTED = { "Reinvested", "Réinvestis", "再投资", "再投資" };

	public static final String[] ARRAY_DASHBOARD_FLYOUT_HOME = { "Home", "Accueil", "主页", "首頁" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_MYACCOUNTS = { "My Accounts", "Mes comptes", "我的账户", "我的賬戶" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_TRANSFERS = { "Transfers", "Virements", "转账", "轉賬" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_BILLS = { "Bills", "Factures", "账单", "賬單" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_APPLEPAY = { "Apple Pay", "Apple Pay", "Apple Pay",
			"Apple Pay" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_TDMYSPEND = { "TD MySpend", "Dépense TD", "TD MySpend",
			"TD MySpend" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_MOBILEPAYMENT = { "TD Mobile Payment", "Factures", "道明移动支付",
			"道明流動付款" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_TDMOBILEDEPOSIT = { "Mobile Deposit", "Dépôt mobile", "移动存款服务",
			"流動存款" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_TDFORME = { "TD for Me", "TD et Moi", "TD for Me",
			"TD for Me" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_INVESTINGACCOUNTS = { "Investing Accounts",
			"Comptes Placements directs TD", "投资账户", "投資賬戶" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_CROSSBORDERBANKING = { "Cross-Border Banking",
			"Services bancaires transfrontaliers", "跨境理财服务", "跨國理財服務" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_PROFILESETTINGS = { "Profile & Settings",
			"Profil et paramètres transfrontaliers", "个人资料和设置", "個人資料和設定" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_APPLEWATCH = { "Apple Watch", "Apple Watch", "Apple Watch",
			"Apple Watch" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_LOCATIONS = { "Locations", "Succursales", "分行网点", "分行" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_GIVEFEEDBACK = { "Give Feedback", "Fournir des commentaires",
			"提供意见反馈", "提供意見回饋" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_CONTACTUS = { "Contact Us", "Contactez-nous", "联系我们", "聯絡我們" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_FAQ = { "FAQ", "Foire aux questions", "常见问答", "常見問題" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_PRIVACYSECURITY = { "Privacy, Security & Legal",
			"Confidentialité, sécurité et avis juridique", "隐私、安全与法律声明", "私隱政策、安全性和法律聲明" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_TRADE = { "Trade", "Négociation", "交易", "交易" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_LOGOUT = { "Logout", "Fermer la session", "退出", "登出" };

	public static final String[] ARRAY_DASHBOARD_REFRESH = { "Refresh", "Rafraîchir", "刷新", "刷新" };
	public static final String[] ARRAY_DASHBOARD_UPDATEQUOTES = { "Update the quotes for your symbols",
			"Mettre à jour les cotes associées à vos symboles", "更新股票代码的报价", "更新股票代號的報價" };
	public static final String[] ARRAY_DASHBOARD_EDITWATCHLIST = { "Edit watchlist",
			"Modifier la liste de surveillance", "编辑自选股观察名单", "編輯自選股觀察名單" };
	public static final String[] ARRAY_DASHBOARD_MANAGERENAME = { "Manage, rename, and add or remove symbols",
			"Gérer, renommer, ajouter ou supprimer des symboles", "管理、重命名、添加或移除股票代码", "管理、重新命名、新增或移除股票代號" };
	public static final String[] ARRAY_DASHBOARD_SETTINGS = { "Settings", "Paramètres", "设置", "設定" };
	public static final String[] ARRAY_DASHBOARD_SWITCHBETWEEN = { "Switch between a banking or investing view",
			"Passer de l’affichage bancaire à l’affichage de placements", "切换理财或投资视图", "切換理財或投資視圖" };

	public static final String[] ARRAY_DASHBOARD_LOCATIONNEAREST = { "Nearest Branch", "Succursale", "最近的分行", "最近分行" };

	public static final String[] ARRAY_DASHBOARD_CONTACTUS = { "Contact Us", "Contactez-nous", "联系我们", "聯絡我們" };

	public static final String[] ARRAY_DASHBOARD_EmptyWLDesc = { "You haven't added any symbols to this Watchlist yet.",
			"Vous n'avez pas encore ajouté de symbole à cette liste de surveillance.", "您尚未添加股票代码到自选股观察名单中。",
			"您沒有添加股票代號到自選股觀察名單。" };
	public static final String[] ARRAY_DASHBOARD_AddSymbolLink = { "Add symbols now", "Ajouter des symboles maintenant",
			"添加股票代码", "添加股票代號" };

	public static final String[] ARRAY_DASHBOARD_ExpiredSymbolError = { "Invalid Symbol ", "Symbole invalide", "股票代码无效",
			"股票代號無效" };

	public static final String[] ARRAY_DASHBOARD_EAnotSignedError = { "Exchange Agreement not signed",
			"Contrat d’abonnement non signé", "未签署交易所协议", "未簽署交易所協議" };

	public static final String[] ARRAY_DASHBOARD_ADDTOWATCHLIST = { "ADD TO OR REMOVE FROM WATCHLIST",
			"AJOUTER OU SUPPRIMER DE LA LISTE DE SURVEILLANCE", "添加至自选股观察名单或从自选股观察名单中移除", "新增至或從自選股觀察名單中移除" };

	public static final String[] ARRAY_DASHBOARD_ADDTOWATCHLISTAND = { "Add to or remove from watchlist",
			"Ajouter ou supprimer de la liste de surveillance", "添加至自选股观察名单或从自选股观察名单中移除", "新增至或從自選股觀察名單中移除" };

	public static final String[] ARRAY_DASHBOARD_EDITWL = { "Edit watchlist", "Modifier la liste de surveillance",
			"编辑自选股观察名单", "編輯自選股觀察名單" };

	public static final String[] ARRAY_DASHBOARD_EDITWLDELETEALL = { "Delete All", "Supprimer tout", "删除全部", "刪除全部" };

	public static final String[] ARRAY_DASHBOARD_EDITWLDELETE = { "Delete", "Supprimer", "删除", "删除" };

	public static final String[] ARRAY_DASHBOARD_EDITWLWARNINGMESSAGE = {
			"Are you sure you want to delete all of the symbols?", "Voulez-vous vraiment supprimer tous les symboles?",
			"您确定要删除所有代号？", "確定要刪除全部代號？" };

	public static final String[] ARRAY_DASHBOARD_WLERRORMSG = {
			"Please read and accept the WebBroker Terms & Conditions in order to view and access your brokerage accounts",
			"Vous devez lire et accepter les modalités de CourtierWeb avant de pouvoir accéder à vos comptes de courtage.",
			"请阅读并接受网上经纪服务条款与条件，然后方可查看及使用您的经纪账户", "請閱讀並接受網上經紀服務的條款與條件，才可查看並存取您的經紀賬戶" };

	public static final String[] ARRAY_DASHBOARD_WLERRORTC = {
			"Terms & Conditions cannot be accepted using the TD App.",
			"Les modalités ne peuvent pas être acceptées dans l’application TD.", "您无法在道明应用程序中接受条款与条件。",
			"無法使用道明應用程式接受條款與條件。" };

	public static final String[] ARRAY_QUICK_ACCESS_ACCOUNTS = { "ACCOUNTS", "COMPTES", "账户", "賬戶" };

	public static final String[] ARRAY_DASHBOARD_TERMS_TERMSOFUSE = { "Terms of Use", "Conditions d'utilisation",
			"使用条款", "使用條款" };

	public static final String[] ARRAY_DASHBOARD_TERMS_INFO = {
			"By using Easy Web or the TDapp, offered by TD Canada Trust and its affiliates, you agree to the terms and conditions of the:",
			"En utilisant BanqueNet ou l’appli TD, offerts par TD Canada Trust et ses sociétés affiliées, vous acceptez les modalités des textes suivants:",
			"使用道明加拿大信托及其附属机构提供的易线网上理财或道明应用程序即表示，您同意以下条款与条件：", "透過使用道明加拿大信託及其附屬機構提供的易線網上理財或道明應用程式，即表示您同意以下條款與條件：" };

	public static final String[] ARRAY_DASHBOARD_TERMS_FINANCIALLINK = { "Financial Services Terms",
			"Modalités des services financiers", "《金融服务条款》", "《金融服務條款》" };

	public static final String[] ARRAY_DASHBOARD_TERMS_CARDHOLDERLINK = {
			"Cardholder and Electronic Financial Services Terms and Conditions",
			"Modalités relatives à l'utilisation des cartes et des services financiers électroniques",
			"《持卡人和电子金融服务条款与条件》", "《持卡人與電子金融服務條款與條件》" };

	public static final String[] ARRAY_DASHBOARD_TERMS_BUSINESSLINK = { "Business Access Services Schedule",
			"Programme de services Accès Affaires", "《商业访问服务条款》", "《商業存取服務條款》" };

	public static final String[] ARRAY_DASHBOARD_TERMS_TERMSLINK = { "Terms and Agreement", "Modalités", "《条款与协议》",
			"《條款與協議》" };

	public static final String[] ARRAY_DASHBOARD_TERMS_DISCLOSURELINK = { "Disclosure", "Déclaration", "道明投资服务有限公司",
			"道明投資服務有限公司" };

	public static final String[] ARRAY_DASHBOARD_TERMS_MUTUALLINK = {
			"for mutual fund accounts held with TD Investment Services Inc.",
			"relative aux comptes de fonds communs de placement détenus auprès des Services d'investissement TD inc.",
			"所持互惠基金账户声明披露", "所持互惠基金賬戶之聲明披露" };

	// MIT Dashboard END

	public static final String[] ARRAY_MF_ACCEPTED_FUND_DETAIL_FEE_ANSWER = { "Yes", "Oui", "是", "是" };
	public static final String[] ARRAY_BRABCH_HEADER = { "Branch", "Succursale", "分行", "分行" };
	public static final String[] ARRAY_FIND_LOCATION = { "Find Locations", "Trouver une succursale", "查找分行", "查找分行" };
	public static final String[] ARRAY_CONFIRM = { "Confirm", "Confirm", "确认", "確認" };
	public static final String[] ARRAY_PREFERENCE_NEW_SECURITY_SETUP = { "New Security Setup",
			"Nouvelle configuration de sécurité", "新的安全设置", "新的安全設定" };
	public static final String[] ARRAY_PREFERENCE_SECURITY_SETTINGS = { "Security Settings", "Paramètres de sécurité",
			"安全设置", "安全設定" };
	public static final String[] ARRAY_PREFERENCE_NOTIFICATIONS = { "Notifications", "Avis", "通知", "通知" };
	public static final String[] ARRAY_PREFERENCE_TD_FOR_ME_SETTINGS = { "TD for Me Settings", "Paramètres TD et moi",
			"TD for Me 设置", "TD for Me 設置" };
	public static final String[] ARRAY_PREFERENCE_WAHTS_NEW = { "What's New", "Nouveautés", "新增功能", "新增功能" };
	public static final String[] ARRAY_PREFERENCE_ACCOUNTS = { "ACCOUNTS", "COMPTES", "账户", "賬戶" };
	public static final String[] ARRAY_PREFERENCE_SECURITY_QUESTION = { "Security Questions", "Questions de sécurité",
			"密保问题", "密保问题" };
	public static final String[] ARRAY_VIEW_PROFILE_LINK_IOS = { "View profile >", "Consulter le profil >", "查看个人资料 >",
			"查看個人資料 >" };
	public static final String[] ARRAY_VIEW_PROFILE_LINK_AND = { "View profile", "Consulter le profil", "查看个人资料",
			"查看個人資料" };
	public static final String[] ARRAY_PAYMENT_AND_TRANSFER = { "Payments & Transfers", "", "", "" };
	public static final String[] ARRAY_CUSTOMIZE_NOTIFICATIONS = { "Customize Notifications", "Personnaliser les avis",
			"定制通知", "定制通知" };
	public static final String[] ARRAY_TD_FOR_ME_NOTIFICATIONS = { "TD for Me Notifications", "Avis TD et moi",
			"TD for Me 通知", "TD for Me 通知" };
	public static final String[] ARRAY_ENABLE_NOTIFICATIONS = { "Enable Notifications", "Activer les notifications",
			"启用通知", "启用通知" };
	public static final String[] ARRAY_CONTACT_US_HEADER = { "Contact Us", "Contactez-nous", "联系我们", "聯絡我們" };

	// CLIP
	public static final String[] ARRAY_MORE_LINK = { "MORE", "PLUS", "更多", "更多" };
	public static final String[] ARRAY_MORE_OPTION_HEADER = { "More Options", "Plus d’options", "更多选项", "更多選項" };
	public static final String[] ARRAY_CREDIT_LIMIT_INCREASE_REQ = { "Request a Credit Limit Increase",
			"Demander une augmentation de limite de crédit", "申请提高信用额度", "申請增加信用限額" };
	public static final String[] ARRAY_CREDIT_LIMIT_INCREASE_HEADER = { "Credit Limit Increase",
			"Augment. limite crédit", "申请提高信用额", "申請提高信用額" };
	public static final String[] ARRAY_CREDIT_LIMIT_INCREASE_DIR = {
			"You must be the Primary cardholder on the card to make a credit limit increase request. Requests take only a few minutes to complete.",
			"Vous n’aurez besoin que de quelques minutes pour remplir une demande et vous recevrez une réponse peu de temps après.",
			"申请只需几分钟即可完成，很快您将收到答复。", "申請只需幾分鐘即可完成，您很快會收到回覆。" };
	public static final String[] ARRAY_CREDIT_HEADER = { "Credit", "Crédit", "贷项", "信貸" };
	public static final String[] ARRAY_CLIP_FORM_TITLE = { "TD Credit Card Limit Increase Request",
			"Demande d’augmentation de la limite d’une carte de crédit TD", "TD Credit Card Limit Increase Request",
			"TD Credit Card Limit Increase Request" };
	// MAB
	public static final String[] ARRAY_MENU_LOCATION = { "Locations", "Succursales", "分行网点", "分行地點" };
	public static final String[] ARRAY_APPOINTMENT_BOOKING = { "Appointment Booking", "Prise de rendez-vous", "分行预约",
			"分行預約" };
	public static final String[] ARRAY_BOOKING_APPOINTMENT_AND = { "BOOK AN APPOINTMENT", "PRENDRE RENDEZ-VOUS", "分行预约",
			"分行預約" };
	public static final String[] ARRAY_BOOKING_APPOINTMENT_IOS = { "BOOK A VISIT", "PRENDRE RENDEZ-VOUS", "分行预约",
			"分行預約" };
	public static final String[] ARRAY_MAB_COPY_TEXT = {
			"Come in and ask us all your banking, credit card, borrowing and investing questions.To complete your appointment booking, you'll leave the TD app and go to the TD website.",
			"Venez nous rencontrer pour obtenir des réponses à vos questions sur les opérations bancaires, les cartes de crédit, les emprunts et les placements.Pour effectuer votre prise de rendez-vous, vous serez dirigé hors de l’appli TD vers le site Web de la TD.",
			"欢迎亲临分行了解更多有关理财、信用卡、贷款和投资的详情。要完成预约，您要退出道明应用程序并前往道明网站。",
			"歡迎親臨分行了解更多有關理財、信用卡、借貸和投資的詳情。要完成預約，您要退出道明應用程式並前往道明網站。" };
	public static final String[] ARRAY_BOOKING_APPOINTMENT_BTN = { "Book Appointment Now",
			"Prendre rendez-vous maintenant", "立即预约会面", "立即預約會面" };
	public static final String[] ARRAY_MANAGE_EXISTING_APPOINTMENT_LINK = { "Manage my existing appointments",
			"Gérer mes rendez-vous", "管理现有预约", "管理現有預約" };
	public static final String[] ARRAY_MAB_FAQ = {
			"What are the benefits of scheduling an appointment online?How can I change or cancel a scheduled appointment?",
			"Quels sont les avantages de prendre rendez-vous en ligne?Comment puis-je modifier ou annuler un rendez-vous?",
			"在线预约有什么好处？如何更改或取消预约？", "網上預約有什麼好處？如何更改或取消預約？" };

	public static final String[] ARRAY_MAB_FAQ_LINK = { "Still have questions? Check our FAQs list.",
			"Vous avez d’autres questions? Consultez notre FAQ.", "想知道更多？看看我们的常见问题。", "想知道更多？看看我們的常見問題。" };
	public static final String[] ARRAY_MAB_URL_LINK = { "www1.new.sys.td.com", "www1.new.sys.td.com",
			"www1.new.sys.td.com", "www1.new.sys.td.com" };
	// damaged card
	public static final String[] ARRAY_REPLACE_A_DAMAGED_CARD = { "Replace a Damaged Card",
			"Remplacement d’une carte endommagée", "更换损坏的卡片", "更換損壞的卡片" };
	public static final String[] ARRAY_DM_REQUEST_FORM_TITLE = { "Damaged TD Credit Card Replacement Request",
			"Demande de remplacement d’une carte de crédit TD endommagée", "Damaged TD Credit Card Replacement Request",
			"Damaged TD Credit Card Replacement Request" };
	public static final String[] ARRAY_REPLACE_A_DAMAGED_CARD_HEADER = { "Replace a Damaged Card",
			"Remplacement une carte", "更换损坏的卡片", "更換損壞的卡片" };
	public static final String[] ARRAY_COPY_REPLACE_DAMAGED_CARD = {
			"If your existing credit card is damaged or not working, you can request a replacement card.",
			"Si votre carte de crédit est endommagée ou ne fonctionne plus, vous pouvez demander une carte de remplacement.",
			"如果您现有的信用卡损坏或无效，您可以申请换卡。", "如果您現有的信用卡損壞或無效，您可以申請換卡。" };
	public static final String[] ARRAY_FORM_INFORMATION = { "Personal Information", "", "", "" };
	// End of CLIP

	// RBP
	public static final String[] ARRAY_RBP_ACESS_CARD = { "Access Card", "Type De Paiement", "添加美国收款人", "新增美國收款人" };
	public static final String[] ARRAY_RBP_HOWOFTEN = { "How Often", "Type De Paiement", "添加美国收款人", "新增美國收款人" };
	public static final String[] ARRAY_RBP_HOWOFTEN_ONCE = { "Once", "Unique", "添加美国收款人", "新增美國收款人" };
	public static final String[] ARRAY_RBP_HOWOFTEN_ONGOING = { "Ongoing", "Récurrent", "添加美国收款人", "新增美國收款人" };
	public static final String[] ARRAY_RBP_FREQUENCY = { "Frequency", "Fréquence", "添加美国收款人", "新增美國收款人" };
	public static final String[] ARRAY_RBP_PAYMENT_END = { "Payment Will End", "Arr?ter les paiements?", "添加美国收款人",
			"新增美國收款人" };
	public static final String[] ARRAY_RBP_START_DATE = { "Start Date", "Ajouter un preneur américain", "添加美国收款人",
			"新增美國收款人" };
	public static final String[] ARRAY_RBP_END_DATE = { "End Date", "Ajouter un preneur américain", "添加美国收款人",
			"新增美國收款人" };
	public static final String[] ARRAY_RBP_NUMBER_OF_PAYMENTS = { "Number of Payments", "Ajouter un preneur américain",
			"添加美国收款人", "新增美國收款人" };
	public static final String[] ARRAY_RBP_SPECIFIC_DATE = { "On a specific date", "? une date pr?cise", "添加美国收款人",
			"新增美國收款人" };
	public static final String[] ARRAY_RBP_AFTER_NEMBER_PAYMENT = { "After a number of payments",
			"Apr?s plusieurs paiements", "添加美国收款人", "新增美國收款人" };
	public static final String[] ARRAY_RBP_DECIDE_CANCEL = { "When I decide to cancel", "Lorsque je le d?ciderai",
			"添加美国收款人", "新增美國收款人" };
	public static final String[][] ARRAY_RBP_FREQUENCY_OPTION = { { "Weekly", "", "", "" }, { "Bi-Weekly", "", "", "" },
			{ "Month-end", "", "", "" }, { "Monthly", "", "", "" }, { "Semi-Monthly", "", "", "" },
			{ "Quarterly", "", "", "" }

	};

	public static final String[] ARRAY_REVIEW_HEADER = { "Review", "", "", "" };
	public static final String[][] ARRAY_RBP_FREQUENCY_OPTION_IOS = { { "Weekly", "", "", "" },
			{ "Bi-weekly", "", "", "" }, { "Month-end", "", "", "" }, { "Monthly", "", "", "" },
			{ "Semi-monthly", "", "", "" }, { "Quarterly", "", "", "" }

	};

	public static final String[] ARRAY_RBP_ON_SPECIFIC_DATE_FOOTNOTE = {
			"Payments scheduled for a weekend or statutory holiday are withdrawn immediately, and then sent to the payee the next business day. It may take a few days for the payment to appear on your bill.",
			"", "", "" };

	public static final String[] ARRAY_RBP_DECIDE_TO_CANCEL_FOOTNOTE = {
			"When you select this option, payments will continue until you go to the bill details screen for this bill payment and select cancel.",
			"", "", "" };

	public static final String[] ARRAY_RBP_REWARDS_CONTENT = {
			"Redeem up to $197 in TD Rewards Points to pay down your credit card balance", "", "", "" };
	public static final String[] ARRAY_RBP_REVIEW_BANNER = { "Please review the details and confirm your bill payment",
			"", "", "" };
	public static final String[] ARRAY_SCHEDULED_PAYMENTS_TITLE = { "Scheduled Payments", "", "", "" };
	public static final String[] ARRAY_RBP_PAY_BILL_ERROR_MSG = {
			"You're not able to schedule that many payments within a 5-year period. Please type in a lower number of payments.",
			"", "不允许在 5 年内安排太多次数的付款。请输入较少付款次数", "" };
	
	public static final String[] ARRAY_RBP_1_NUM_PAYMENT_ERROR_MSG = {
			"Please select a number higher than 1.",
			"", "不允许在 5 年内安排太多次数的付款。请输入较少付款次数", "" };
	// public static final String[] ARRAY_RBP_FREQUENCY_SEMI_MONTHLY = {
	// "Semi-Monthly","","",""};
	// public static final String[] ARRAY_RBP_FREQUENCY_QUARTERLY = {
	// "Quarterly","","",""};
	//

	// End of RBP
	public static final String[] ARRAY_LOGIN_SECURITY_QUESTION = { "Security Question", "Question de sécurité", "安全问题",
			"安全問題" };
	public static final String[] ARRAY_SECURITY_LOGIN = { "Login", "Ouvrir une session", "登录", "登入" };
	public static final String[] ARRAY_MFA_ENTER_ANSWER = { "Enter your answer", "Entrez votre réponse", "输入您的答案",
			"輸入您的答案" };
	// UA Core
	public static final String[] ARRAY_ACCOUNT_TOTAL = { "Total", "Total", "总计", "總計" };
	public static final String[] ARRAY_ADD_LOGIN = { "Add Login", "Ajouter une connexion", "添加登录", "新增登入" };
	public static final String[] ARRAY_ADD_CANADIAN_PAYEE = { "Add Canadian Payee", "Ajouter un preneur", "添加加拿大收款人",
			"新增加拿大收款人" };
	public static final String[] ARRAY_ADD_US_PAYEE = { "Add U.S. Payee", "Ajouter un preneur américain", "添加美国收款人",
			"新增美國收款人" };
	public static final String[] ARRAY_PAY_US_BILL_TITLE = { "Pay U.S. Bill", "Payer des factures américaines",
			"支付美国账单", "支付美國賬單" };
	public static final String[] ARRAY_PAYEE_CAPTION = { "Payee", "Preneur", "收款人", "收款人" };
	public static final String[] ARRAY_PAY_CANDIAN_BILL_TITLE = { "Pay Bill", "Paiement de factures", "支付账单", "支付賬單" };
	public static final String[] ARRAY_INVESTING_OPEN_ACCOUNT = { "Open a TD Direct Investing Account",
			"Ouvrir un compte Placements directs TD", "开设道明自管投资账户", "開設道明自管投資賬戶" };
	public static final String[] ARRAY_INVESTING_CROSS_MSG = {
			"Trade with confidence. Open a TD Direct Investing account today.",
			"Négociez en toute confiance. Ouvrez un compte Placements directs TD.", "开设道明银行自管投资账户 增强信心，驾驭全局。",
			"立即開設道明自管投資賬戶 增強信心，駕馭全局。" };

	// UA Core End

	// P2P EUF

	public static final String[] ARRAY_REQUEST_MONEY_HEADER = { "Request Money", "Demander des fonds", "", "" };
	public static final String[] ARRAY_PAYMENT_AND_TRANSFER_AUTODEPOSIT = { "Manage Autodeposit", "Gérer Autodépôt", "",
			"" };
	public static final String[] ARRAY_AUTODEPOSIT_ALMOST_DONE = { "Almost done!", "Vous avez presque terminé!", "",
			"" };
	public static final String[] ARRAY_AUTODEPOSIT_EMAIL_SENT_MSG = { "Check your email for instructions from INTERAC",
			"Consultez les instructions que vous avez reçues", "", "" };
	public static final String[] ARRAY_AUTODEPOSIT_PENDING_STATUS = { "Pending", "En attente", "", "" };
	public static final String[] ARRAY_AUTODEPOSIT_ACTIVE_STATUS = { "Active", "Actif", "", "" };
	public static final String[] ARRAY_AUTODEPOSIT_DELETE_MSG = { "The Autodeposit setup was deleted successfully.",
			"Configuration Autodépôt supprimée", "", "" };
	public static final String[] ARRAY_AUTODEPOSIT_UPDATE_MSG = { "The Autodeposit setup was edited successfully.",
			"Configuration Autodépôt modifiée", "", "" };
	public static final String[] ARRAY_REQUEST_MONEY_REQUEST_SENT = { "Request sent!", "Demande envoyée!", "", "" };
	public static final String[] ARRAY_REQUEST_MONEY_SUCCESS_MSG = {
			"Your recipient will be emailed details on how to respond to your request.",
			"Le destinataire recevra un courriel lui indiquant comment répondre à votre demande.", "", "" };
	public static final String[] ARRAY_REQUEST_MONEY_MONEY_REQUESTED = { "Money Requested", "Fonds demandés", "", "" };
	public static final String[] ARRAY_REQUEST_MONEY_CANCELLED_STATUS = { "Cancelled", "Annulé", "", "" };
	public static final String[] ARRAY_REQUEST_MONEY_WRONG_EMAIL_STR = { "INVALID EMAIL ADDRESS",
			"Adresse courriel non valide", "", "" };
	public static final String[] ARRAY_CUSTOMER_ELIGIBILITY_ERROR_MSG = { "There appears to be an issue with your",
			"Il semble y avoir un problème avec votre compte", "", "" };
	public static final String[] TRADE_RESPONSE_1 = {
			"I acknowledge the trade name displayed above IS the trade name of the business",
			"Je confirme que le nom commercial ci‑dessus EST celui de l’entreprise.", "", "" };
	public static final String[] TRADE_RESPONSE_2 = {
			"I acknowledge the trade name displayed above IS NOT the trade name of the business",
			"Je confirme que le nom commercial ci‑dessus N’EST PAS celui de l’entreprise", "", "" };
	public static final String[] TRADE_RESPONSE_3 = { "I acknowledge the business DOES NOT operate under a trade name",
			"Je confirme que l’entreprise NE MÈNE PAS ses activités sous un nom commercial", "", "" };
	public static final String[] CONTACT_ADDED_SUCCESS_MSG = { "The contact has been added successfully",
			"Ce destinataire a été ajouté avec succès", "", "" };
	public static final String[] ADD_CONTACT_FROM_PHONE_MSG = { "Add a contact from your phone",
			"Ajouter un destinataire à partir de la liste de contacts de votre téléphone", "", "" };
	public static final String[] CONTACT_EDIT_SUCCESS_MSG = { "information has been updated successfully",
			"Les renseignements sur le destinataire ont été modifiés avec succès", "", "" };
	public static final String[] SEND_MONEY_SUCCESS_MSG = { "The recipient will be notified by email",
			"Le destinataire sera avisé par courriel", "", "" };
	public static final String[] CONTACT_DELETE_SUCCESS_MSG = { "The contact was deleted successfully",
			"Ce destinataire a été supprimé avec succès", "", "" };
	public static final String[] MONEY_SENT_LBL = { "Money Sent", "Fonds virés", "", "" };
	public static final String[] MONEY_REQUESTED_LBL = { "Money Requested", "Fonds demandés", "", "" };
	public static final String[] SEE_ALL_LBL = { "See all", "Tout afficher", "", "" };
	public static final String[] SEND_MONEY_TRANSFER_CANCELLED_RECEIPT = { "Transfer Cancelled",
			"[FR]Transfer Cancelled", "", "" };
	public static final String[] ADD_AUTODEPOSIT_RECEIPT_HEADER = { "Almost done!", "Vous avez presque terminé!", "",
			"" };
	public static final String[] ADD_AUTODEPOSIT_RECEIPT_SUB_HEADER = { "Check your email for instructions",
			"Consultez les instructions que vous avez reçues", "", "" };
	public static final String[] CANCEL_MONEY_RECEIPT_HEADER = { "Request Cancelled", "Demande annulée", "", "" };
	public static final String[] SETUP_AUTODEPOSIT_STR = { "Set up Autodeposit", "Établir Autodépôt", "", "" };
}

