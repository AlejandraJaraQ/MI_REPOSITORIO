function validarFormulario() {
    var carrera = document.getElementById('carrera').value;
    var apellidos = document.getElementById('apellidos').value;
    var nombres = document.getElementById('nombres').value;
    var dni = document.getElementById('dni').value;
    var fechaNacimiento = document.getElementById('fechaNacimiento').value;
    var correo = document.getElementById('correo').value;
    var contrasena = document.getElementById('contrasena').value;
    var terminos = document.getElementById('terminos').checked;
  
    if (dni.length !== 8 || isNaN(dni)) {
      alert('El número de DNI debe tener 8 dígitos numéricos.');
      return false;
    }

    var regex = /\d/;
    if (regex.test(nombres) || regex.test(apellidos)) {
      alert('Los nombres y apellidos no deben contener números.');
      return false;
    }
  
  
    if (carrera === '' || apellidos === '' || nombres === '' || fechaNacimiento === '' || correo === '' || contrasena === '' || !terminos) {
      alert('Por favor, completa todos los campos y acepta los términos y condiciones.');
      return false;
    }
  
    return true;
  }
  