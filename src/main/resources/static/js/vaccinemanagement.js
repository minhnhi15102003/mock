// JavaScript
document.addEventListener("DOMContentLoaded", function() {
  // Ẩn mặc định khi trang được tải
  var options = document.getElementById("vaccineOptions");
  options.style.display = "none";
});

function toggleOptions() {
  var options = document.getElementById("vaccineOptions");
  var vaccineListIcon = document.getElementById("vaccineListIcon");
  var createVaccineIcon = document.getElementById("createVaccineIcon");
  var vaccineManagement = document.getElementById("vaccineManagement");

  // Chuyển đổi trạng thái hiển thị của options
  if (options.style.display === "none" || options.style.display === "") {
    options.style.display = "block";
    vaccineListIcon.style.display = "inline-block"; // Hiển thị icon
    createVaccineIcon.style.display = "none"; // Ẩn icon
    vaccineManagement.classList.add('clicked'); // Thêm class 'clicked'
  } else {
    options.style.display = "none";
    vaccineManagement.classList.remove('clicked'); // Xóa class 'clicked'
  }
}

function showVaccineList() {
  var vaccineListIcon = document.getElementById("vaccineListIcon");
  var createVaccineIcon = document.getElementById("createVaccineIcon");

  vaccineListIcon.style.display = "inline-block"; // Hiển thị icon khi chọn "Vaccine List"
  createVaccineIcon.style.display = "none"; // Ẩn icon khi chọn "Vaccine List"

  console.log("Vaccine List");
}

function showCreateVaccine() {
  var vaccineListIcon = document.getElementById("vaccineListIcon");
  var createVaccineIcon = document.getElementById("createVaccineIcon");

  vaccineListIcon.style.display = "none"; // Ẩn icon khi chọn "Create Vaccine"
  createVaccineIcon.style.display = "inline-block"; // Hiển thị icon khi chọn "Create Vaccine"

  console.log("Create Vaccine");
}
