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
- Trạng thái 1: Working Directory
  Là các untrackeđ file trong máy của chúng ta, có thể là bất kì file nào và Git Local chưa theo dõi/ biết về nó

- Trạng thái 2: Staging Area
  + Là kho chứa các file ở Git Local đã được chuyển đổi từ trạng thái Untracked File sang Tracked file để Git có thể theo dõi chúng 
  + Để chuyển đổi từ Untracked File sang Tracked File, ta sử dụng lệnh 
git add . (để add tất cả các untracked file) hoặc git add <tên file> (add 1 file cụ thể

- Trạng thái 3: Reponsitory
 + Đây là nơi chúng ta đẩy toàn bộ các file đã được tracked ở trong Staging Area lên Git Server với điều kiện là source file đã được remote với Reponsitory
(git  init -> git remote add origin <Link cua resposi tren git hub>. Sau đó sử dụng lệnh git remote, nếu hiện ra origin thì chúng ta đã remote thành công)
 + Để đẩy toàn bộ dữ liệu ở Staging Area lên Repository, ta sử dụng lệnh
git push origin master 


