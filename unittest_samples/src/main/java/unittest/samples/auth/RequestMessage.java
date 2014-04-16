package unittest.samples.auth;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RequestMessage {
		private RequestType requestType;
		private LocationCode locationCode;
		private String correlationTag;
		private AccountNumber accountNumber;
		private FormattedAmount formattedAmount;
		private String iso4217_currencyCode;
		private Date timestamp;

		public RequestMessage(
					RequestType requestType,
					LocationCode locationCode,
					String correlationTag,
					AccountNumber accountNumber,
					FormattedAmount amount,
					String iso4217_currencyCode,
					Date timestamp) {
				this.requestType = requestType;
				this.locationCode = locationCode;
				this.correlationTag = correlationTag;
				this.accountNumber = accountNumber;
				this.formattedAmount = amount;
				this.iso4217_currencyCode = iso4217_currencyCode;
				this.timestamp = timestamp;
		}
		
		public String messageString() {
				StringBuilder message = new StringBuilder();
				message.append(requestType.code());
				message.append(locationCode.asString());
				message.append(correlationTag);
				message.append(accountNumber.asString());
				message.append(formattedAmount.asString());
				message.append(iso4217_currencyCode);
				SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
				message.append(formatter.format(timestamp));
				return message.toString();
		}
		
		
		
}
