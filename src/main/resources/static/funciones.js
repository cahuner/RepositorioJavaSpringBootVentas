/* global swal */

function eliminar(id){
    swal({
            title: "Estas seguro de eliminar?",
            text: "Una vez eliminado, ¡no podrá recuperar este registro!",
            icon: "warning",
            buttons: true,
            dangerMode: true,
          })
          .then((OK) => {
            if (OK) {
                $.ajax({
                    url:"/eliminar/"+id, 
                    success: function(res){
                        console.log(res);
                    }
                });
              swal("¡El registro ha sido eliminado!", {
                icon: "success",
              }).then((ok)=>{
                    if (ok) {
                       location.href="/listar";
                    }
              });
            } else {
              swal("¡Tu registro NO se ha eliminado!");
            }
          });
}