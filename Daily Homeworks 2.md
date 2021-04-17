Daily Homeworks
( 16/04/2021)

Question 1:
Giả sử trong 1 thư mục có tên Buoi2 có 2 file mới tạo lần lượt là bai1.txt và bai2.txt. Có những cách nào đã học trong buổi 1 để chuyển trạng thái 2 file mới từ Untrachked file (báo màu đỏ) sang Staged (Xanh lá)?
*
- Cách 1: sử dụng git add . để convert  tất cả các file từ trạng thái Untracked 
               sang Tracked ( được theo dõi trong vùng nhớ local Stage Area)
- Cách 2: sử dụng git add <tên file cụ thể> để convert  1 file cụ thể file từ 
               trạng thái Untracked  sang Tracked ( được theo dõi trong vùng nhớ  
                local Staging Area)

Question 2:
Hãy phân biệt Tracked file và Untracked file trong git?
*
- Untracked file: là bất kì thứ gì nằm trong vùng Working directory chưa được
                           commit (git add) sang vùng nhớ Stage Area để Git theo dõi
- Tracked file: chúng có thể là những file đã được sửa đổi/ chưa sửa đổi và 
                        chúng đã được commit vào Stage Area (đã sử dụng git add)
                        để theo dõi (Git đã biết về nó)

Question 3:
Hãy nêu ý nghĩa 3 trạng thái của file trong git (3 stages in git). Các lệnh sử dụng trong Git để chuyển các trạng thái?


*
- Trạng thái 1: Modified
  Là các trackeđ file trong máy của chúng ta được sửa đổi nhưng chưa được lưu vào git (chưa được đánh dấu), do đó nó không ảnh hưởng đến phiên bản trước đó của file này đã được lưu trong git
- Trạng thái 2: Staged
  + Là các tracked file đã được đánh dấu để sẽ commit lưu vào git
  + Để chuyển đổi từ trạng thái Modified sang Staged, ta sử dụng lệnh 
git add . (để đánh dấu tất cả các tracked file) hoặc git add <tên file> (add 1 file cụ thể

- Trạng thái 3: Commited
+ Là trạng thái cuối cùng của file sau khi được commit từ trạng thái staged. Nó sẽ tiến hành lưu phiên bản mới nhất của file này vào trong git
+ Câu lệnh sử dụng: git commit –m “<message>”



