Daily Homeworks
(17/04/2021)

Question: Khi khởi tạo git (git init), git sẽ tạo ra 1 folder. Tác dụng của folder này là gì? Giả sử, nếu xóa hoặc di chuyển folder này sang 1 thư mục khác thì điều gì sẽ xảy ra? Tại sao?

* 
- Khi tiến hành khởi tạo Git thông qua câu lệnh git init, nó sẽ tạo 1 thư mục con ẩn tên .git, thư mục này sẽ chứa tất cả các thông tin mô tả cho kho dự án (Git Repo) ở Git Local. Những thông tin này được gọi là metadata, gồm các thu mục như objects, refs…
- Nếu xóa hoặc di chuyển folder này sang 1 thư mục khác thì nó sẽ xóa kho lưu trữ của Git đi (Git Repo) trong thư mục chứa folder .git ẩn-> không còn remote đến Repository trên Git Server và chúng ta cũng không thể tiến hành lưu trữ các trạng thái của file dữ liệu trước và sau khi sửa đổi vì không quả lý dự án hay server để lưu trữ Repo từ xa
 

