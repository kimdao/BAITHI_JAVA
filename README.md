# BAITHI_JAVA
# BAITHI_JAVA
Để đáp ứng nhu cầu nhắc nhở trong công việc, học tập, đi làm, đi chơi, ... thì 1 ứng dụng báo thức là rất cần thiết
Ứng dụng báo thức của em như sau:
1. Thiết kế giao diện
 Giao diện của ứng dụng bao gồm
	+ TimePicker: cho phép lựa chọn thời gian của ngày.
	+ 2 nút Button: Để hẹn giờ và dừng lại báo thức
	+ 1 TextView: Để hiển thị mình đặt mấy giờ. Để khi tới giờ sẽ báo thức.
	+ 1 TextView ở giữa 1 Button mình đặt chỉ để cho giao diện được đẹp hơn.
2. Lấy thời gian từ TimePicker
	+ Khởi tạo đối tượng calendar để lấy ngày và giờ hiện tại( Vì thời gian nên mình chỉ lấy giờ và phút).
3. Tạo Receiver, AlarmManager và Pending Intent 
	+ Khởi tạo 1 class AlarmReceiver dùng để nhận các Intent từ hệ thống.
	(Ví dụ khi đặt thời gian là 10h02p thì khi đồng hồ chạy tới 10h02p thì nó sẽ chạy vào cái class này sẽ log những yêu cầu của mình.
	+ Khởi tạo AlarmManager cho phép truy cập vào hệ thống báo động của máy 
	+ Khởi tạo PendingIntent 
Khi chạy mà tắt đi app thì PendingIntent vẫn hoạt động và bên alarmReceiver đã nhận sẽ thực hiện.
4. Tạo service và phát ra âm thanh
	+ Khởi tạo 1 class music để lưu file nhạc chuông
5. Dừng âm thanh thông báo

Khi AlarmReceiver nhận thông báo thì sẽ chuyển về class music để thực hiện.
