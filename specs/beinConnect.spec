Specification Heading
=====================

Subscribe
---------------------------
tags:  subscribe

 * URL "https://connect-th.beinsports.com/en"
 * Wait Spinner
 * Subscribe Click
 * Wait Spinner
 * Select Package "ONE MONTH"
 //ONE WEEK,ONE MONTH,ONE YEAR
 * Wait Spinner
 * Select Your Package Package: "Monthly Pass with One Week Free Trial",Amount: "99"
 //One Month Pass,Monthly Pass with One Week Free Trial
 * Wait Spinner
 * Create Account FirstName: "Fatih",LastName: "Karadag",EmailOrPhone: "random",Password: "Test12",CommunicationPermission: "true"
 //CommunicationPermission true or false EmailOrPhone random  or  correct email adress 
 * Info Close
 * Payment Method PaymentType: "Credit Card Recurring"
 * Payment ExpectedTotalCharge: "1.00",CardHolderName: "test",CardNumber: "4355084355084358",CardExpMonth: "12",CardExpYear: "2026",cardCvc: "000"
 * Payment Error Message "The transaction has been denied"
