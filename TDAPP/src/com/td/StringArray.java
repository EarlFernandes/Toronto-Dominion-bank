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
			"I consent to receiving the Fund Details and Fees electronically and I acknowledge I've had the opportunity to review them prior to purchasing the fund. I acknowledge that I may be charged a short term trading fee of up to 2% of my purchase cost if I switch or redeem my Funds (except the Money Market Funds). Please note: This fee does not apply to Fund units purchased through distribution / dividend reinvestment. Short term trading fees are paid directly to the Fund. You can refer to the applicable fund facts or the simplified prospectus for further details.",
			"Je consens à recevoir les renseignements au sujet du fonds et des frais par voie électronique et je reconnais que j’ai eu l’occasion de les examiner avant d’investir dans le fonds. Je comprends que je pourrais devoir payer des frais d’opérations à court terme s’élevant jusqu’à 2 % du coût d’achat si je substitue ou rachète des parts du fonds (sauf dans le cas d’un Fonds du marché monétaire). Remarque : Ces frais ne s’appliquent pas aux parts de fonds achetés dans le cadre d’un régime deréinvestissement des distributions ou des dividendes. Les frais d’opérations à court terme sont versés directement dans le fonds. Vous pouvez consulter l’aperçu du fonds ou le prospectus simplifié pertinent pour plus de précisions.",
			"我同意通过电子方式获取基金概况和费用，并确认我有机会在购买基金之前查阅基金概况和费用。 我同意，如果我转换或赎回基金（货币市场基金除外），我可能需要支付不超过购买成本2%的短期交易费。 请注意：此费用不适用于通过分红/股息再投资购买的基金单位。短期交易费将直接支付给基金。请参阅相关基金概况或简化招股说明书了解更多详情。",
			"我同意以電子方式獲取基金詳情和費用，並確認我在購買基金前都有機會先查閱內容。 本人確認了解，如果我轉換或贖回基金（貨幣市場基金除外），我可能需要支付不超過購買成本2%的短期交易費。 註：此費用不適用於透過分紅/股息再投資所購買的基金單位。短期交易費將直接支付給基金。請參閱相關基金概況或簡化版招股章程以了解更多詳情。" };
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
			"Vos renseignements seront uniquement utilisés pour communiquer avec vous au sujet de votre achat.Vérifiez qu’aucune opération visant un REER ou un CELI ne vous fera dépasser votre plafond de cotisation.Si une opération est refusée pour quelque raison que ce soit, nous l’annulerons et nous vous aviserons par courriel dans un délai d’un jour ouvrable.Vous pourriez devoir payer des frais d’opérations à court terme s’élevant jusqu’à 2 % du coût d’achat si vous substituez ou rachetez des parts du fonds (sauf dans le cas d’un Fonds du marché monétaire). Ces frais ne s’appliquent pas aux parts de fonds achetés dans le cadre d’un régime de réinvestissement des distributions ou des dividendes. Les frais d’opérations à court terme sont versés directement dans le fonds. Pour plus de précisions, veuillez consulter l’aperçu du fonds ou le prospectus simplifié pertinent. Gestion de Placements TD Inc. (GPTD) verse une commission de suivi à Services d’investissement TD Inc. en contrepartie des services et des conseils qui vous sont offerts, tant et aussi longtemps que vous détenez des parts des Fonds Mutuels TD. Veuillez vous reporter à l’aperçu du fonds pertinent pour obtenir plus de précisions.",
			"您的个人信息仅用于我们就您的基金购买情况与您联络。请确保所有注册退休储蓄计划(RSP)和免税储蓄账户(TFSA)交易不超过您允许的供款限额。如果交易出于任何原因被拒，我们将在一个工作日内取消交易并向您发送电子邮件通知。如果您转换或赎回基金（货币市场基金除外），您可能需要支付不超过购买成本2%的短期交易费。此费用不适用于通过分红/股息再投资购买的基金单位。短期交易费直接支付给基金。请参阅相关基金概况或简化招股说明书了解更多详情。道明资产管理有限公司（TDAM）在您持有道明互惠基金单位期间向道明投资服务有限公司（TDIS）支付尾随佣金，作为其向您提供服务和咨询的费用。有关详细信息，请参阅基金概况。",
			"我們僅在因有關您的購買時，才會使用您的資訊與您聯絡。請確保所有註冊退休儲蓄計劃(RSP)和免稅儲蓄賬戶(TFSA)交易不超過您允許的供款限額。如果交易因任何原因被拒，我們將在一個工作日內取消交易並向您發送電郵通知。如果您轉換或贖回基金（貨幣市場基金除外），您可能需要支付不超過購買成本2%的短期交易費。此費用不適用於透過分紅/股息再投資所購買的基金單位。短期交易費將直接支付給基金。請參閱相關基金概況或簡化版招股章程以了解更多詳情。道明資產管理有限公司（TDAM）在您持有道明互惠基金單位期間向道明投資服務有限公司（TDIS）支付尾隨佣金，作為其向您提供服務和諮詢的費用。有關詳細信息，請參閱基金概況。" };
	public static final String[] ARRAY_TAB_BALANCE = { "Balances", "Soldes", "结余", "結餘" };
	public static final String[] ARRAY_TAB_FUND = { "Funds", "Fonds", "基金", "基金" };
	public static final String[] ARRAY_FUND_TAB_LEFT = { "FUND", "FONDS", "基金", "基金" };
	public static final String[] ARRAY_TAB_ACTIVITY = { "Activity", "Activité", "活动", "活動" };
	public static final String[] ARRAY_TABLE_DATE = { "DATE", "DATE", "日期", "日期" };
	public static final String[] ARRAY_TABLE_TRANSACTION = { "TRANSACTION", "OPÉRATION", "交易", "交易" };
	public static final String[] ARRAY_TABLE_AMOUNT = { "AMOUNT", "MONTANT", "金额", "金額" };
	public static final String[] ARRAY_TABLE_MARKET_VALUE = { "MARKET VALUE", "VALEUR MARCHANDE", "市场价值", "市價" };
	public static final String[] ARRAY_TABLE_UNIT = { "UNITS", "PARTS", "单位", "單位" };
	public static final String[] ARRAY_TABLE_PRICE_PER_UINT = { "PRICE PER UNIT", "PRIX PAR PART", "单位价格", "單位價格" };
	public static final String[] ARRAY_MF_PURCHASE_BUTTON = { "PURCHASE MUTUAL FUNDS", "ACHETER DES FONDS COMM.",
			"购买互惠基金", "購買互惠基金" };
	public static final String[] ARRAY_MF_CANADIAN_DOLLAR_NOTE = {
			"All values in Canadian Dollars unless otherwise stated.",
			"Toutes les valeurs sont en dollars canadiens, sauf avis contraire.", "除非另有说明，否则所有金额均为加元。",
			"所有金額均為加元，除非另有說明。" };
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
			"Looks like you're not set up to purchase mutual funds. Let us help you by calling 1-866-568-0951.",
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
	public static final String[] ARRAY_OTP_SETUP_GET_STARTED = { "Get started", "Commencer", "立即开始", "立即開始" };
	public static final String[] ARRAY_OTP_SETUP_GET_STARTED_IOS = { "Get Started", "Commencer", "立即开始", "立即開始" };
	public static final String[] ARRAY_OTP_SETUP_ADD_ANOTHER_PHONE = { "Add another phone?",
			"Ajouter un autre téléphone?", "添加其他电话号码", "新增更多電話號碼" };
	public static final String[] ARRAY_OTP_SETUP_INVALID_PASSCODE_FORMAT = { "Please enter numbers only",
			"Veuillez entrer des chiffres seulement", "请仅输入数字", "請僅輸入數字" };
	public static final String[] ARRAY_OTP_SETUP_EXPIRED_PASSCODE = { "This code has expired", "Ce code a expiré",
			"此代码已失效", "此驗證碼已失效" };

	public static final String[] ARRAY_OTP_SETUP_SECURITY_EMAIL_HEADER = {
			"Please provide an email address to get security alerts",
			"Veuillez fournir une adresse courriel pour recevoir les alertes de sécurité", "请提供一个用户接收安全信息的电子邮件邮箱地址",
			"請提供電郵地址，用來接收安全性資訊" };
	public static final String[] ARRAY_OTP_SETUP_UNABLE_DELETE_PHONE = { "Unable to delete phone",
			"Impossible de supprimer le téléphone", "无法删除电话号码", "無法刪除電話號碼" };
	public static final String[] ARRAY_OTP_SETUP_UNABLE_DELETE_PHONE_MSG = {
			"Before you can delete this phone, you must add another number so you can always get your security codes",
			"Avant de supprimer ce téléphone, vous devez ajouter un autre numéro sur lequel recevoir des codes de sécurité",
			"删除此电话号码前，您必须添加一个其他电话号码以确保始终可接收安全码", "刪除此電話號碼前，您必須新增另一個電話號碼以確保您可隨時接收驗證碼" };
	public static final String[] ARRAY_OTP_SETUP_PASSCODE_VERIFIED = { "Verified", "Validé", "验证成功", "驗證成功" };
	public static final String[] ARRAY_OTP_SETUP_SETUP_COMPLETE_HEADER = { "Security Setup Complete",
			"Configuration de sécurité terminée", "安全设置完成", "安全設定完成" };

	public static final String[] ARRAY_OTP_UPDATE_HEADER = {
			"You can review and manage your current security settings below",
			"Vous pouvez consulter et gérer vos paramètres de sécurité ci-dessous", "您可在下方查看并管理您目前的安全设置",
			"您可在下方查看並管理您目前的安全設定" };
	public static final String[] ARRAY_OTP_UPDATE_TEST_PHONE_HEADER = { "Test Phones (optional)",
			"Test de téléphone (facultatif)", "测试电话号码（可选）", "測試電話號碼（非必要）" };
	public static final String[] ARRAY_OTP_UPDATE_LOGIN_OPTION_HEADER = { "Change Login Option",
			"Modifier l’option d’ouverture de session", "更改登录选项", "變更登入選項" };
	public static final String[] ARRAY_OTP_UPDATE_CHANGE_EMAIL_HEADER = { "Change Security Email",
			"Modifier l’adresse courriel de sécurité", "更改安全信息邮箱", "變更安全性資訊收件箱" };
	public static final String[] ARRAY_OTP_UPDATE_COMPLETE_HEADER = { "Thanks", "Merci", "谢谢", "謝謝" };

	public static final String[] ARRAY_INVESTING_ACCOUNTS = { "Investing Accounts", "Comptes Placements directs TD",
			"投资账户", "投資賬戶" };
	public static final String[] ARRAY_MOBILE_PAYMENT = { "TD Mobile Payment", "Paiement mobile TD", "道明移动支付",
			"道明移動支付" };
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
	public static final String[] ARRAY_DASHBOARD_FLYOUT_FAQ = { "Frequently Asked Questions", "Foire aux questions",
			"常见问答", "常見問題" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_PRIVACYSECURITY = { "Privacy, Security & Legal",
			"Confidentialité, sécurité et avis juridique", "隐私、安全与法律声明", "私隱政策、安全性和法律聲明" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_TRADE = { "Trade", "Négociation", "交易", "交易" };
	public static final String[] ARRAY_DASHBOARD_FLYOUT_LOGOUT = { "Logout", "Fermer la session", "退出", "登出" };

	// MIT Dashboard END

	public static final String[] ARRAY_MF_ACCEPTED_FUND_DETAIL_FEE_ANSWER = { "Yes", "Oui", "是", "是" };
	public static final String[] ARRAY_BRABCH_HEADER = { "Branch", "Succursale", "分行", "分行" };
	public static final String[] ARRAY_FIND_LOCATION = { "Find Locations", "Trouver une succursale", "查找分行", "查找分行" };
	public static final String[] ARRAY_CONFIRM = { "Confirm", "Confirm", "确认", "確認" };
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
	// UA Core
	public static final String[] ARRAY_ACCOUNT_TOTAL = { "Total", "Total", "总计", "總計" };
	public static final String[] ARRAY_ADD_LOGIN = { "Add Login", "Ajouter une connexion", "添加登录", "新增登入" };
	public static final String[] ARRAY_ADD_CANADIAN_PAYEE = { "Add Canadian Payee", "Ajouter un preneur", "添加加拿大收款人",
			"新增加拿大收款人" };
	public static final String[] ARRAY_ADD_US_PAYEE = { "Add U.S. Payee", "Ajouter un preneur américain", "添加美国收款人",
			"新增美國收款人" };
	public static final String[] ARRAY_INVESTING_OPEN_ACCOUNT = { "Open a TD Direct Investing Account",
			"Ouvrir un compte Placements directs TD", "开设道明自管投资账户", "開設道明自管投資賬戶" };
	public static final String[] ARRAY_INVESTING_CROSS_MSG = {
			"Trade with confidence. Open a TD Direct Investing account today.",
			"Négociez en toute confiance. Ouvrez un compte Placements directs TD.", "开设道明银行自管投资账户 增强信心，驾驭全局。",
			"立即開設道明自管投資賬戶 增強信心，駕馭全局。" };

	// UA Core End
}
